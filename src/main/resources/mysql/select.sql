select * from cloth_type right join clothing on cloth_type.id = clothing.type_id;


insert into clothing (type_id, name, url) VALUES ((select id from cloth_type where name='T恤'), '123', '123');


select * from clothing inner join cloth_type;