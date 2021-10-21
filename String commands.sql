use hr;
select ascii(last_name) from employees;
select last_name,char_length(last_name) from employees;
select char_length('hello there');
select concat(first_name,last_name)full_name from employees;
select concat(last_name, ' works in a ', department_id, 'with job id' , job_id)from employees;
select concat_ws(' ',last_name, ' works in a ', department_id, 'with job id' , job_id)from employees;
select first_name,instr(first_name,'a') from employees;
select last_name,instr(last_name,'o') from employees;
select last_name,lcase(last_name) from employees;
select last_name,ucase(last_name) from employees;
select left("good afternoon",5);
select length("good afternoon");
select locate('a','good afternoon');
select lower("AISH");
select lpad('good',8,'*');
select rpad('good',8,'$');
select mid('afternoon',5,4);
select position('e' in 'abcde');
select repeat('happy', 4);


select replace('good afternoon','afternoon','evening');
use hr;
select * from employees;
select replace(last_name,'Landry','Joe') from employees where employee_id=127;
select replace(last_name,'Landry','Joe') from employees where last_name='Landry';
select reverse("Aish");
select last_name,reverse(last_name) from employees;
select last_name,left(last_name,1) from employees;
select last_name,max(salary),min(salary),strcmp(max(salary),min(salary)) from employees;
select last_name,right(last_name,1) from employees;
select last_name,substr(last_name,1,4) from employees;
select ltrim('     Aish      ');
select rtrim('     Aish      ');


