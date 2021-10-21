 select * from employees;
select employees.employee_id,employees.last_name,employees.job_id,jobs.job_title from employees
inner join jobs on employees.job_id=jobs.job_id;
select employees.employee_id,employees.last_name,employees.department_id,departments.department_name
 from employees
left join departments on employees.department_id=departments.department_id;
select employees.employee_id,employees.last_name,employees.department_id,departments.department_name
 from employees
right join departments on employees.department_id=departments.department_id;
select employees.employee_id,employees.last_name,employees.department_id,departments.department_name
 from employees
left join departments on employees.department_id=departments.department_id
union all
select employees.employee_id,employees.last_name,employees.department_id,departments.department_name
 from employees
right join departments on employees.department_id=departments.department_id;
select employees.employee_id,employees.last_name,employees.department_id,departments.department_name 
from employees
cross join departments on employees.department_id=departments.department_id;


