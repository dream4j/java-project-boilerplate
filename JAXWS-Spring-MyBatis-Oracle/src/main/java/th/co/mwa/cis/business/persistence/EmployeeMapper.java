package th.co.mwa.cis.business.persistence;

import java.util.List;

import th.co.mwa.cis.business.domain.Employee;

public interface EmployeeMapper {
	
	List<Employee> getEmployeeList();
	
	Employee getEmployeeById(String employeeId);
	
	List<Employee> getEmployeeByName(String name);
	
	List<Employee> getEmployeeByExample(Employee employee);
}
