use traindatabase;
CREATE TABLE trains(trainno int primary key,trainname varchar(45),source varchar(45),destination varchar(45),ticketprice int);

Insert into  trains (trainno,trainname,source,destination,ticketprice) values (1001,'Shatabdi
Express','Bangalore','Delhi',2500);
Insert into  trains (trainno,trainname,source,destination,ticketprice) values (1002,'Shatabdi
Express','Delhi','Bangalore',2500);
Insert into trains (trainno,trainname,source,destination,ticketprice) values (1003,'Udyan
Express','Bangalore','Mumbai',1500);
Insert into trains (trainno,trainname,source,destination,ticketprice) values (1004,'Udyan
Express','Mumbai','Bangalore',1500);
Insert into  trains (trainno,trainname,source,destination,ticketprice) values (1005,'Brindavan
Express','Bangalore','Chennai',1000);
Insert into  trains (trainno,trainname,source,destination,ticketprice) values (1006,'Brindavan
Express','Chennai','Bangalore',1000);
select * from trains;
desc trains;
create table ticket(id int primary key,count int);
alter table ticket auto_increment=100;
insert into ticket(id,count)values(1,100);
select * from ticket;