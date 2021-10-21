select department_id,sum(salary) from employees group by department_id;
select avg(salary)avgsal,max(salary)maxsal,min(salary)minsal,sum(salary)sumsal,department_id from employees 
group by department_id=90;
select avg(salary)avgsal,max(salary)maxsal,min(salary)minsal,sum(salary)sumsal ,department_id from employees
 where department_id>40 group by department_id;
select sum(salary),department_id from employees
      group by department_id
      order by department_id DESC;
select department_id,count(last_name) from employees group by department_id;
select department_id,manager_id,count(last_name) from employees group by manager_id;
select department_id,sum(salary),avg(salary) from employees
 group by department_id
having avg(salary)>8000;
select department_id,max(salary) from employees
group by department_id
having max(salary > 10000);
select job_id,sum(salary) from employees
where job_id NOT LIKE '%REP%'
group by job_id;
select job_id,sum(salary) from employees
where job_id NOT LIKE '%REP%'
group by job_id
having sum(salary)>=12000;
select job_id,sum(salary) from employees
where job_id NOT LIKE '%REP%'
group by job_id
having sum(salary)>=12000
order by sum(salary) DESC;
select avg(salary) from employees
group by department_id;
select max(avg(salary)) from employees
group by department_id;