select employee_id,last_name,salary from employees
    where salary>(select salary from employees where last_name ='Ernst');
    select max(sal) from (Select avg(salary) sal from employees group by department_id) as result;
    
    select avg(salary) sal from employees group by department_id
    order by avg(salary)desc;
    select employee_id,job_id,last_name,salary from employees 
    where job_id=(select job_id from employees where last_name='Ernst')
       and salary>(select salary from employees where last_name='Austin');
select employee_id,last_name,job_id,salary from employees
where salary=(select min(salary) from employees);
select department_id,min(salary) from employees
group by department_id
having min(salary)>(select min(salary)from employees where department_id=50);
select employee_id,last_name,department_id,salary from employees
where salary IN(select min(salary) from employees group by department_id);
    