package th.co.mwa.cis.business.service;

import java.util.List;

import th.co.mwa.cis.business.domain.Department;
import th.co.mwa.cis.business.domain.Employee;

public interface EmployeeInformationService {

	List<Employee> getEmployeeList();
	
	List<Department> getDepartmentList();
	
	List<Employee> findEmployee(Employee employee);
	
	List<Department> findDepartment(String name);

}
