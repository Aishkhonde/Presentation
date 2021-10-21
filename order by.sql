select last_name,job_id,department_id,hire_date from employees order by hire_date;
select last_name,job_id,department_id,hire_date from employees
order by hire_date DESC;
select last_name,department_id,salary *12 annualsal from employees
order by annualsal;
select last_name,department_id,salary *12 annualsal from employees
order by annualsal,last_name DESC;
select employee_id,lower(last_name)from employees;
select employee_id,lower(last_name)from employees;
select concat ('hello','world');
select substr('helloworld',1,5);
select length('helloworld');
select instr('helloworld','w');
select replace('Jack and Jill','J','B1');
select trim('h' from 'helloworld');
select lpad(salary,10,'*')from employees;
select rpad(last_name,15,'*')from employees;
select employee_id,concat(first_name,last_name)Name,
job_id,length(last_name),instr(last_name,'a')"contains a?"
from employees where
substr(job_id,4)='REP';
select upper(concat(substr(last_name,1,8),'_B84'))
from employees where department_id=50;
select round(45.936,2)from dual;
select truncate(45.678,2)from dual;
select mod(11,2)from dual;
select last_name,salary,mod(salary,5000)
from employees where job_id='SA_REP';

