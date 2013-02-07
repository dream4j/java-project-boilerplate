package th.co.mwa.cis.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.co.mwa.cis.business.domain.Department;
import th.co.mwa.cis.business.domain.Employee;
import th.co.mwa.cis.business.persistence.DepartmentMapper;
import th.co.mwa.cis.business.persistence.EmployeeMapper;
import th.co.mwa.cis.business.service.EmployeeInformationService;

@Service
public class EmployeeInformationServiceImpl implements EmployeeInformationService {
	
	@Autowired
	private EmployeeMapper employee;

	@Autowired
	private DepartmentMapper department;
	
	@Override
	public List<Employee> getEmployeeList() {

		return this.employee.getEmployeeList();
	}

	@Override
	public List<Department> getDepartmentList() {

		return this.department.getDepartmentList();
	}

	@Override
	public List<Employee> findEmployee(Employee employee) {

		return this.employee.getEmployeeByExample(employee);
	}

	@Override
	public List<Department> findDepartment(String name) {

		return this.department.getDepartmentByName(name);
	}

}
