drop table if exists user;
create table user (/*用户*/
    account  varchar(18) not null   comment '账号',
    username varchar(18) not null   comment '使用者姓名',
    password varchar(18) not null   comment '密码',
    email    varchar(40)            comment '邮箱',
    primary key (account),
    constraint usernameLength check ( length(username) >=6 ),
    constraint passwordLength check ( length(password) >=6 ),
    constraint emailFormat check ( email regexp '^[A-Za-z0-9]+([-+.][A-Za-z0-9]+)*@[A-Za-z0-9]+([-.][A-Za-z0-9]+)*\.[A-Za-z0-9]+([-.][A-Za-z0-9]+)*$')
);
# email那里不能设置default为''，不然设置之后会触发emailFormat检测，导致无法插入数据

drop table if exists authority;
create table authority(/*权限*/
    account  varchar(18) not null               comment '账号',
    type     varchar(5)  not null               comment '权限类型, 出库：out，入库：in，用户：user，服装：cloth',
    query    boolean     not null default false comment '查询',
    increase boolean     not null default false comment '新增',
    renew    boolean     not null default false comment '更新',
    clear    boolean     not null default false comment '删除',
    primary key (account, type),
    constraint typeFormat check ( type='out' or type='in' or type='user' or type='cloth' )
);
alter table authority add constraint accountKey
    foreign key (account) references user (account)
        on delete cascade;

drop table if exists warehouse;
create table warehouse(/*仓库*/
    id       int          auto_increment not null comment '仓库id',
    name     varchar(12)                 not null comment '仓库名字',
    capacity int unsigned                not null comment '仓库容量',
    primary key (id),
    unique key nameKey (name),
    constraint warehouseDateFormat check ( name != '' ),
    constraint capacityFormat check ( capacity > 0 )
);

drop table if exists cloth_type;
create table cloth_type(/*服装类型*/
    id   int         not null auto_increment comment '类型id',
    name varchar(20) not null                comment '类型名称',
    primary key (id),
    unique key nameKey (name),
    constraint clothTypeFormat check ( name != '' and length(name) <= 20 )
);

drop table if exists clothing;
create table clothing(/*服装*/
    id      int          not null auto_increment comment '服装id',
    type_id int          not null                comment '服装类型',
    name    varchar(64)  not null                comment '衣服名字',
    url     varchar(128) not null default ''     comment '链接',
    primary key (id),
    constraint clothingDateFormat check ( name != '' )
);
alter table clothing add constraint clothTypeKey
    foreign key (type_id) references cloth_type (id);

drop table if exists clothing_info;
create table clothing_info(/*服装属性*/
    clothing_id int          not null                comment '服装id',
    color       varchar(12)  not null                comment '颜色',
    size        varchar(6)   not null                comment '大小',
    id          int          not null auto_increment comment 'id',
    count       int unsigned not null default '0'    comment '数量',
    unique key(id),
    primary key (clothing_id, color, size),
    constraint infoFormat check ( color != '' and size > 0 )
);
alter table clothing_info add constraint clothingIdKey
    foreign key (clothing_id) references clothing (id)
        on delete cascade;

drop table if exists warehouse_record;
create table warehouse_record(/*出入库表*/
    serial_number char(19)    not null               comment '序列号，格式为：GKRR+I/O(in/out)+yyyyMMdd+六位随机数',
    account       varchar(18) not null               comment '操作人账号',
    time          datetime    not null               comment '操作时间',
    location      varchar(32) not null               comment '目的地，来源',
    is_delete     boolean     not null default false comment '是否删除',
    primary key (serial_number),
    constraint whcFormat check ( serial_number != '' and length(serial_number)=19)
);


drop table if exists whc_detail;
create table whc_detail(/*出入库记录细节*/
    warehouse_id  varchar(12)  not null             comment '仓库id',
    clothing_id   int          not null             comment '服装id',
    info_id       int          not null             comment '服装信息id',
    serial_number char(18)     not null             comment '序列号',
    count         int unsigned not null default '0' comment '数量',
    primary key (warehouse_id, clothing_id, info_id)
);
alter table whc_detail add constraint serialNumberKey
    foreign key (serial_number) references warehouse_record (serial_number);
alter table whc_detail add constraint warehouseIdKey
    foreign key (warehouse_id) references warehouse (id);
alter table whc_detail add constraint clothIdKey
    foreign key (clothing_id) references clothing (id);
alter table whc_detail add constraint infoIdKey
    foreign key (info_id) references clothing_info (id);