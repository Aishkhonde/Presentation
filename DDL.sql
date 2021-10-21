 -- creation of table---
 create database Aish;
 use Aish;
 -- creation of table--
 create table cars (sno int,name varchar(20));
 desc cars;
 insert into cars values(2,'BMW'),(3,'Mercedes'),(5,'posche');
 select * from cars;
 -- create table from another table--
 create table four_wheelers(select * from cars);
 select * from four_wheelers;
 -- automatic_increment Constraints--
 create table stocks(sno int primary key auto_increment,sname varchar(30));
 desc stocks;
 insert into stocks(sname) values('Eclairs'),('oreo'),('fantasy');
 select * from stocks;
 -- check constraints --
 create table persons(id int not null,name varchar(30)not null,age int not null check(age>=18));
 insert into persons(id,name,age) values(1,'Aish',21),(2,'Divya',22),(3,'Vani',23);
 select * from persons;
 -- default constraints--
  create table places2(id int not null,name varchar(30)not null,age int ,city_name varchar(20)
  default 'Bangalore');
 insert into places2(id,name,age,city_name) values(1,'Aish',21,'Bidar'),
 (2,'Divya',22,'Hoskote'),(3,'Vani',23,'mumbai');
 insert into places2(id,name,age)values(4,'Rakshi',34);
 select * from places2;
 -- not null constraints--
 create table customer(cid int primary key,cname varchar(30)not null,caddress varchar(20)
 default 'bangalore',cphone int not null);


insert into customer (cid,cname,cphone)values(2,"Sush",788);
select * from customer;
truncate customer;
drop table customer;
-- unique constraint --
create table persons2(Id int not null,last_name varchar(255)not null,first_name varchar(255),
age int,unique(Id));
alter table persons2
add unique(Id);
select * from person2;
drop table person1;
-- primary key --
create table persons3(Id int not null,last_name varchar(255)not null,first_name varchar(255),
age int,primary key(Id));
alter table persons3
add primary key(Id);
desc persons2;




 
 
 