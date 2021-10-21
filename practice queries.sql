use hr;
-- name of employee work in deptno with the job_id use last_name column
select last_name,concat(first_name,last_name)employee_name,department_id,job_id 
from employees where department_id;

--  employees who joined in year 2000---
select employee_id,last_name,hire_date from employees where date_format(hire_date,'%Y')=2000;



-- employees who joined after 1996_jan--
select employee_id,last_name,hire_date from employees where date_format(hire_date,'%Y%M')>'1996 January';

 -- employees whose name starts between S to R-- 
  select first_name from employees where first_name like "R%" or first_name like "S%" order by first_name;

-- employees who work under manager_id(200,201)--
select concat(first_name,last_name)name, department_id,employee_id,manager_id 
from employees where manager_id in(200,201);




-- employees who are REP or MAN and paid more than 6000
select job_id,sum(salary)from employees where job_id  like '%REP' or job_id  like '%MAN'
group by job_id having sum(salary)>6000 order by sum(salary);




-- cal annual salary of each employees and print them in desc order --
select concat(first_name,last_name)name,employee_id,department_id,sum(salary)annualsal from employees
 group by employee_id 
 order by employee_id desc;
 
 
 
 
 -- replace last_name of 'Landry' to 'JOE' in the employee table
 select replace(last_name,'Landry','Joe') from employees where last_name='Landry';
 
 
 -- first occurance of the character 'o' in the last_name--
 select last_name from employees where last_name like'o%';
 
-- "2020_B84" for employee last_names who works in depart_id=90--
select upper(concat(lpad(last_name,12,'2020_B84'))) from employees where department_id=90; 

-- find the currentdate with local date and time--
select current_timestamp();

-- find the average commission paid for all the employees--
select avg(commission_pct)from employees;
select (sum(commission_pct)/count(commission_pct)) average from employees;
-- only for department_id 80--
select avg(salary),max(salary),concat(first_name,last_name)name,department_id from employees 
where department_id =80;


-- only for department_id 90--
select avg(salary),max(salary),concat(first_name,last_name)name,department_id from employees 
where department_id =90;

-- only for department_id 100--
select avg(salary),max(salary),concat(first_name,last_name)name,department_id from employees 
where department_id =100;

-- find the average and highest salary paid for department_id in ( 80,90,100)--
select avg(salary),max(salary),concat(first_name,last_name)name,department_id from employees 
where department_id in(80,90,100);

-- find the department_id where the highest paid  employee salary is more than 1000--
select concat(first_name,last_name)name,department_id,max(salary) from employees
 group  by department_id having max(salary>1000); 
 
 -- find the department_id who is paid the max avg salary in the organization:use subqueries--
 select employee_id,max(salary),department_id from employees
 where salary > any(select avg(salary) from employees where department_id);
 
 -- find location_id and dept_name where the "Ernst" work--
 select location_id,department_name,department_id from departments
 where department_id=(select department_id from employees where last_name='Ernst');
 select department_id,location_id,department_name from departments where department_id=60 ;
 select * from departments;
 -- find all the employee names who work in "Tokyo"--
  -- city(use sub queries:department,locations,employees table) --
 select concat(first_name,last_name)fullname ,department_id from employees
 group by (select department_id from employees where
  (select location_id
 from departments where location_id=(select city from locations where city='Tokyo')));
 select * from locations;
 select * from departments;
 select * from employees;
 
 -- find the employee names who are the maximum paid salary in the organization--
 select concat(first_name,last_name)fullname ,department_id,salary,max(salary)
 from employees where department_id;
 -- find the employees who are drawing min salary in their respective
 -- departments(use jobs table for getting the min salary and use subqueries)--
 select min(salary),department_id,job_id,concat(first_name,last_name)fullname  from employees 
 group by job_id
 order by min(salary)=(select min_salary from jobs where job_id );
 -- find the employee name and their job_id and job_titles by joining employee and jobs table--
 select employees.employee_id,employees.job_id,jobs.job_id,jobs.job_title from employees 
 inner join jobs on employees.job_id=jobs.job_id;
 
 
 
 
 
 
 
 
 select min_salary,job_id from jobs ;
 
 
 
 
 
 
 
 
 
 
 
 








 
 
 
 


select employee_id,last_name,salary from employees 
where salary>(select salary from employees where last_name='Ernst');
select last_name,date_format(hire_date,'%W %D %M %Y') from employees where date_format(hire_date,'%Y')='1996';
select max(salary),department_id,employee_id from employees where department_id in(90,100,101);
select concat(first_name,last_name)name from employees where last_name like '_o%';
select concat(first_name,last_name)name from employees where last_name like '%o%';
