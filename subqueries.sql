select employee_id, salary from employees where job_id='IT_PROG';
select employee_id,job_id,salary from employees
where salary >ANY (select salary from employees where job_id='IT_PROG');
select employee_id,job_id,salary from employees
where salary >ALL (select salary from employees where job_id='IT_PROG');
