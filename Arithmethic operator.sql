select employee_id,last_name,job_id,salary from employees
 where ((salary >=5000) and (job_id LIKE '%MAN%'));
 select last_name,job_id from employees where job_id NOT IN ('IT_PROG','ST_MAN');
 select last_name,job_id,salary from employees where ((job_id='SA_REP')
 OR (job_id ='AD_PRES')) and(salary >5000);
  select last_name,job_id,salary from employees where (job_id='SA_REP')
 OR (job_id ='AD_PRES') and(salary >5000);
 
 