select date('2021-02-01');
select adddate('2021-01-01',interval 10 day);
select adddate('2021-01-01',interval 10 month);
select subdate('2021-01-01',interval 10 day);
select curdate();
select datediff('2021-08-02','2021-07-21');
-- shows the week day--
select date_format('2021-09-21','%a');
-- shows the month in characters--
select date_format('2021-09-21','%b');
select date_format('2021-09-21','%a %b');
-- shows the month in numeric --
select date_format('2021-09-21','%c');
-- shows the date in numeric --
select date_format('2021-09-21','%d');
select date_format('2021-09-21','%e');
select date_format(now(),'%e');
select now();
select date_format(now(),'%h');
select date_format(now(),'%H');
select date_format(now(),'%h:%i');
select date_format('2000-02-10','%j');
select date_format('2021-09-16','%j');
--- shows the month in full name--
select date_format('2021-09-16','%M');
select date_format('2021-09-16 23:04:44','%p');
select date_format('2021-09-15','%u');
select date_format('2021-09-16','%U');
-- shows the day of week from monday--
select date_format('2021-09-16','%w');
-- shows the day of week from mon in characters--
select date_format('2021-09-16','%W'); 
-- shows the week num and year--
select date_format('2021-09-16','%v %x');

-- current time and date--
select current_timestamp();
select curdate();
select curtime();
select dayofmonth(current_timestamp());
select dayofweek(curdate());
select dayofyear(current_timestamp());
select dayofweek(current_timestamp());
select employee_id,last_name,hire_date from employees where date_format(hire_date,'%Y')=2000;
select employee_id,last_name,hire_date from employees where date_format(hire_date,'%Y%M')>='1996 January';










