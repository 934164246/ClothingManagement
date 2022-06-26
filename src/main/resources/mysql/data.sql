use library;

select now();
insert into authority (account, type) values ('abcdasdfasd', '自增管理');
insert into authority (account, type, query) values ('abcdasdfasd', '自增管理', true);

insert into warehouse_record (serial_number, account, time, location) values ('1234123123123', '123123123', '2021-03-01 17:05:23', '123');
# SimpleDateFormat("yyyy-MM-dd HH:mm:ss")，可以传送string类型的值

#user
insert into user values ('123123123', '超级管理员账号', '123123123', '934164246@qq.com');
insert into user values ('123321', '张三', '123321', 'rurigokou934164246@gmail.com');
insert into user values ('123456', '李四', '123456', '934164246@foxmail.com');
insert into user (account, username, password) values ('321321', '王五', '321321');
insert into user (account, username, password) values ('654321', '赵六', '654321');

#autority
insert into authority values ('123123123', 'user', true, true, true, true);
insert into authority values ('123321', 'in', true, true, false, false);
insert into authority values ('123321', 'out', true, true, false, false);
insert into authority values ('321321', 'in', true, true, true, true);
insert into authority values ('321321', 'out', true ,true, true, true);
insert into authority values ('654321', 'cloth', true, true, true, false);

#warehouse
insert into warehouse (name, capacity) VALUES ('火龙仓库', 2000);
insert into warehouse (name, capacity) VALUES ('金龙仓库', 1300);
insert into warehouse (name, capacity) VALUES ('水龙仓库', 2000);
insert into warehouse (name, capacity) VALUES ('岩龙仓库', 1000);
insert into warehouse (name, capacity) VALUES ('风龙仓库', 1500);
insert into warehouse (name, capacity) VALUES ('雷龙仓库', 2000);
insert into warehouse (name, capacity) VALUES ('草龙仓库', 2000);

#cloth_type
insert into cloth_type (name) value ('T恤');
insert into cloth_type (name) value ('牛仔裤');
insert into cloth_type (name) value ('休闲裤');
insert into cloth_type (name) value ('衬衫');
insert into cloth_type (name) value ('羽绒服');
insert into cloth_type (name) value ('卫衣');
insert into cloth_type (name) value ('风衣');
insert into cloth_type (name) value ('内裤');
insert into cloth_type (name) value ('文胸');
insert into cloth_type (name) value ('背心');
insert into cloth_type (name) value ('西装');
insert into cloth_type (name) value ('旗袍');
insert into cloth_type (name) value ('毛衣');
insert into cloth_type (name) value ('吊带');
insert into cloth_type (name) value ('丝袜');
insert into cloth_type (name) value ('工装');
insert into cloth_type (name) value ('夹克');

#clothing
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (2, 1, 'T1 队服2022年新款LCK英雄联盟战队faker同款衣服男士短袖T恤', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/bc68fe60967040198a4a6f91a3a8d5c0.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (3, 1, '短袖t恤男士2022新款夏季宽松百搭衣服白色半袖体恤衫潮牌上衣男', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/e5d00e0948bc41409e1f0ac300667d3f.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (4, 1, 'WHOOSIS（不知其名）幻影logo纯色t恤夏季打底宽松短袖潮牌男情侣', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/8358038960d94cf78cff5df673d11886.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (5, 2, '森马牛仔裤男个性棋盘格2022夏季新款韩系潮男生水洗裤子时尚ins', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/10be6fb42ff940b4ba210bab605162cc.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (6, 2, '牛仔九分裤男士夏季薄款休闲直筒宽松高街男生潮牌春秋水洗长裤子', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/4c59231db4be48a2bdb77c7a3b65cfab.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (7, 2, '直筒牛仔裤男士休闲宽松夏季2022新款ins潮流百搭潮牌春秋长裤子', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/7095db31bb2d434ea9d7fc8e93d9eddb.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (8, 3, '冰丝休闲裤子男士夏季薄款速干束脚九分男裤潮牌宽松运动长裤男款', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/a7a41bd9bc9f4063aa6b68eef6f21b79.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (9, 3, '冰丝裤子男夏季薄款休闲长裤男士宽松小脚裤潮牌垂感九分运动裤男', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/2cafe3b774504fd2832ae8b8ac77f979.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (10, 3, '【夏天穿的牛仔裤】KREATE黄泥染高街水洗做旧SLIM直筒休闲裤男女', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/76b4b0849b14433ebd096ff850b6392c.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (11, 4, 'Ralph Lauren/拉夫劳伦男装 经典版型牛津布衬衫RL10013', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/c8f5e2a6497444da91d3a5326b984130.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (12, 4, '森马短袖衬衫男吸湿速干2022夏季新款学院风男生宽松制服衬衣潮流', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/0abce2ef31604ae9a7c1fc41c7806ea2.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (13, 4, '【F426官方店】国潮牌情侣嘻哈夏季四色大logo贴布宽松短袖衬衫', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/d19bde53003a4fdaabfe27b6c8d125ec.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (14, 5, '森马2021情侣外套羽绒服男冬季宽松短款潮牌男士加厚面包服青少年', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/4493b3a5ef2a4cd4bbfcc2432a49fbdb.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (15, 5, '芬兰HALTI 儿童加厚防风鹅绒海德联名羽绒服滑雪服HDJBS48119S', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/079ed4e485b54a8d85f20fd1db8bc200.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (16, 5, '哥伦比亚官网羽绒服男装2021冬季热能反射中长款情侣款外套WE0994', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/05bb5380396b4fa0affd2e44e055a85c.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (17, 6, '男生克莱因蓝春季卫衣男宽松潮ins连帽春秋潮牌外套2022新款上衣', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/43ed9bd16f5544288e59101a70fa064a.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (18, 6, '[大森]森马卫衣男夜光印花韩版日系慵懒2022早春新款男生连帽上衣', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/6f14484e6dde4aa29a724ed48f1ec94e.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (19, 6, '森马卫衣男基础纯色韩版落肩新款2022秋季简约慵懒易搭配圆领上衣', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/26ef554162be47b0ac6bb01489a58856.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (20, 7, '神仙club 原创设计2022定制英伦复古风衣外套百搭中长款 3天内发', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/523208601aac4b1f9154117e8bc77cdc.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (21, 7, 'Ps Paul Smith女士格纹细节风衣FARFETCH发发奇22春夏新品', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/c1095e579095433699446432f90e174e.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (22, 7, '日系风衣外套女oversize高街春季休闲百搭原宿风上衣ins潮设计感', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/ffd3ca67e02045ca80c53ba306ad84c1.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (23, 8, '蕉内抑菌纯棉裆男士内裤301A薄冰丝感无痕平角内裤男四角裤3件装', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/08e9f459443e47d28d7ae0d0d9f25c50.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (24, 8, '冰丝内裤女士无痕夏季薄款全纯棉裆抗菌性感少女生纯欲三角裤胖mm', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/031671ec99b7440d9fbbc5936da63eaf.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (25, 8, '南极人男士内裤男纯棉平角裤透气印花夏季大码短裤衩潮流四角裤头', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/8f0c8866ae29482aa21c2d90e771a307.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (26, 9, '大胸显小胸内衣女收副乳防下垂缩胸薄款夏季无痕运动文胸大码胸罩', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/7effa84fb2234d979e9bbc3835a35cf9.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (27, 9, '乳胶内衣女小胸聚拢显大收副乳防下垂胸罩大胸显小薄款夏季文胸罩', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/d6052db30df648dea43730e3461b814d.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (28, 9, '恒源祥无痕内衣女夏季薄款无钢圈文胸美背蕾丝性感运动防下垂胸罩', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/864dcaf983ff43199f671b6d691313ef.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (29, 10, '运动纯色背心男士夏季无袖宽松潮牌健身新疆纯棉坎肩篮球T恤马甲', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/23393cac86f84055878e421c8a86a645.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (30, 10, '运动背心男士宽松夏季潮牌ins纯棉健身无袖坎肩白色打底衫短袖t恤', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/2c2df5d1e7ba4ae4a77680b76d9c0e99.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (31, 10, 'CHINISM CH美式休闲运动篮球背心男潮牌夏季宽松男士无袖T恤坎肩', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/e5e19402cd614db8b5b31af154511ca0.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (32, 11, '【澳嘉】初剪羊毛西装男高级感结婚礼服蓝色职业正装男士西服套装', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/c096d7d55d534f1da644e5488d697354.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (33, 11, '本派休闲西装男新款韩国进口英伦风渐变宽条纹那不勒斯西服外套潮', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/bf5f0a93c8814d9cbfec0a26c9757eb1.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (34, 11, '【意大利进口面料】亚麻西服外套男夏季薄款单西绿色休闲西装男士', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/07080ee3b5a8430a885672124fe3f822.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (35, 12, '壹仟鲤【夏叶田田】~藏肉修身~双层泡泡袖改良旗袍新中式国风裙', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/ff1cc23aa1954924904afbde4b33cf56.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (36, 12, '杭州真丝连衣裙2022新款夏季高端名牌桑蚕丝绣花改良旗袍裙子妈妈', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/844694f6997a441db1d8976b101d12f7.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (37, 12, '圆缺原创设计师款 新中式改良旗袍连衣裙女夏季国风镂空盘扣A字裙', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/26feb52b2d1c49b7ae8bb6b8ec7015bb.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (38, 13, 'ELAND衣恋套头毛衣2022年秋冬新款女士简约宽松版型时尚休闲V领', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/d971b83e8288454d829a899e0b184472.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (39, 13, 'We11Done男女通用logo嵌花高领毛衣FARFETCH发发奇22春夏新品', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/86af5f9951624ee1a3b5eb28532fc600.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (40, 13, 'V领针织背心女韩版学生宽松学院风套头毛衣马甲2021新款洋气百搭', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/f560766f02284ab6b72bbc53ce9fa414.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (41, 14, '芭比姨 法式挂脖连衣裙女夏季新款鱼骨露背辣妹碎花裙纯欲吊带裙', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/3d18d29cee7645ccb2eb9cb0c94a05e6.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (42, 14, '初梦POKEMENG 银河玫瑰 欧根纱蓬蓬娃娃裙女夏气质超仙吊带连衣裙', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/30dfdabdcbde4b82b791c4c1ca6d8aa6.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (43, 14, 'DREAM SEVEN77 碎花吊带连衣裙2022夏季新款荷叶边氛围感开叉长裙', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/3edf3c7462f64f359160545f071903dd.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (44, 15, '涞觅「丝滑0.01」性感诱惑丝袜情调蕾丝长筒袜超薄过膝防滑高筒女', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/18fde767341b4a00a476314c6834b474.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (45, 15, '浪莎丝袜女薄款连裤袜夏季菠萝防勾超薄长筒光腿黑丝肉色神器性感', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/5df539a3edcc47b0bf1acce4e7b13e93.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (46, 15, '【撩汉出品】性感吊带丝袜 蕾丝花边吊带袜 长筒袜吊带套装', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/bc2c4548e8da421ca1678c7b4c616b72.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (47, 16, '美式高街外套女2022新款早春女装夹克韩版宽松设计感小众休闲上衣', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/d0098ada732a43b6a87509917ff7a3e7.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (48, 16, '森马牛仔外套男2022早春外衣基础复古水洗潮牌工装男生翻领夹克潮', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/55183afe274e4bd4985acb1bfe37f499.jpg');
INSERT INTO `clothing`(`id`, `type_id`, `name`, `url`) VALUES (49, 16, 'T1 队服2022年新款LCK英雄联盟战队春秋夹克外套faker同款衣服', 'https://gokoururi.oss-cn-shanghai.aliyuncs.com/img/2022/06/08/9f514aaac998496ca497db049d44f431.jpg');


#clothing_info