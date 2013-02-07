package th.co.mwa.cis.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import th.co.mwa.cis.business.domain.Department;
import th.co.mwa.cis.business.domain.Employee;
import th.co.mwa.cis.business.service.EmployeeInformationService;

@WebService(serviceName="EmployeeInformationService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class EmployeeInformationWebService {

	/* Inject by Spring */
	private EmployeeInformationService employeeInformation;

	@WebMethod(exclude=true)
	public void setEmployeeInformation(EmployeeInformationService employeeInformation) {
		this.employeeInformation = employeeInformation;
	}
	
	@WebMethod(operationName="getEmployeeList")
	public Employee[] getEmployeeList() {
		
		List<Employee> employeeList = employeeInformation.getEmployeeList();
		Employee[] items = new Employee[employeeList.size()];
		
		return employeeList.toArray(items);
	}
	
	@WebMethod(operationName="getDepartmentList")
	public Department[] getDepartmentList() {
		
		List<Department> departments = employeeInformation.getDepartmentList();
		Department[] items = new Department[departments.size()];
		
		return departments.toArray(items);
	}
	
	@WebMethod(operationName="findEmployee")
	public Employee[] findEmployee(Employee employee) {
		
		List<Employee> employeeList = employeeInformation.findEmployee(employee);
		Employee[] items = new Employee[employeeList.size()];
		
		return employeeList.toArray(items);
	}
	
	@WebMethod(operationName="findDepartment")
	public Department[] findDepartment(String name) {
				
		List<Department> departments = employeeInformation.findDepartment(name);
		Department[] items = new Department[departments.size()];
		
		return departments.toArray(items);
	}
	
}
