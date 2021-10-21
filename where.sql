select employee_id,department_id,last_name from employees where department_id=90;
select employee_id,department_id,last_name from employees where last_name='Vollman';
select employee_id,last_name,hire_date,salary from employees where hire_date='1997-10-10';
select employee_id,last_name,hire_date,salary from employees where date_format(hire_date,'%Y')='1996';
select employee_id,last_name,hire_date,salary from employees where date_format(hire_date,'%y')='96';
select employee_id,last_name,date_format(hire_date,'%W %D %M %Y'),salary
 from employees where date_format(hire_date,'%Y')='1996';

