select * from departments;
select * from employees;
insert into departments (department_id,department_name,manager_id,location_id) values(300,'HR',205,1700);
update departments set manager_id=206 where department_id=300;
update departments set department_name='Business' where department_id=300;
delete from departments where department_id=300;

select * from departments;

