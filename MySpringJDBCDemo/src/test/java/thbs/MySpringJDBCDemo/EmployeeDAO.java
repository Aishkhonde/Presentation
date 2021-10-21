package thbs.MySpringJDBCDemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO implements EmployeeCRUD{
	private JdbcTemplate  jdbcTemplate;
	

	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		if(employee!=null)
		{
			jdbcTemplate.update("insert into employee values(?,?,?)",
					new Object[] {employee.getEmployeeId(),employee.getEmployeeName(),employee.getSalary()});
		}
		
	}

	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Employee e=new Employee();
				e.setEmployeeId(rs.getInt(1));
				e.setEmployeeName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				return e;
			}
			
			
		});
	}

	@Override
	public Employee selectAEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from employee  where employeeId=?",
				new Object[] {Integer.valueOf(employeeId)},new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Employee e=new Employee();
						e.setEmployeeId(rs.getInt(1));
						e.setEmployeeName(rs.getString(2));
						e.setSalary(rs.getInt(3));
						return e;
					}
					
				});
		
	}
}
	
	


