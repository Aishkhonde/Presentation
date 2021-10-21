select employee_id,hire_date from employees;
select avg(salary)avgsal,max(salary)maxsal,min(salary)minsal,sum(salary)sumsal,department_id from employees 
where department_id=90;
select avg(salary)avgsal,max(salary)maxsal,min(salary)minsal,sum(salary)sumsal,department_id from employees
 where department_id=50;
select min(hire_date),max(hire_date) from employees where department_id=50;
select count(*) from employees where department_id=50;
select max(salary) from employees where job_id LIKE '%REP%';
select employee_id,commission_pct from employees;
select count(commission_pct) from employees;
select count(*) from employees;
select employee_id,department_id from employees;
select count(distinct department_id) from employees;
select avg(commission_pct)from employees;
select (sum(commission_pct)/count(*))average from employees;
select (sum(commission_pct)/count(commission_pct))average from employees;
