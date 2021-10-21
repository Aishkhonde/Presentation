create database Details;
use Details;
create table students1(Regdno int not null,name varchar(20)not null,branch varchar(20)not null);
desc students1;
insert into students1 values(0001,'Ram','CSE'),(0002,'Hari','MECH'),
(0003,'Pradeep','EEE'),(0004,'Deepak','ETC');
select * from students1;
select Regdno, name from students1 where name='Pradeep';
select name,branch from students1;
select count(*) from students1;
alter table students1 add address varchar(20);


