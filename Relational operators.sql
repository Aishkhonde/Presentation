select last_name,salary from employees where salary<=8000;
select last_name,salary from employees where salary>=8000;
select last_name,salary from employees where salary=5800;
select last_name,salary from employees where salary<>8000;
select last_name,salary from employees where salary between 2500 and 3000;
select employee_id,last_name,manager_id,salary from employees;
select employee_id,last_name,manager_id,salary from employees
where manager_id in (101,201,107);
select first_name from employees where first_name like 'S%';
select first_name from employees where first_name like '_o%';
select first_name from employees where first_name like '%o%';
select first_name from employees where first_name like '%op%';


