package thbs.MySpringJDBCDemo;

import java.util.List;

public interface EmployeeCRUD {
	void insert(Employee employee);
	List<Employee> selectAll();
	Employee selectAEmployee(int employeeId);

}
