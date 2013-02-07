package th.co.mwa.cis.business.persistence;

import java.util.List;

import th.co.mwa.cis.business.domain.Department;

public interface DepartmentMapper {
	
	List<Department> getDepartmentList();
	
	Department getDepartmentById(String departmentId);

	List<Department> getDepartmentByName(String departmentName);
	
	List<Department> getDepartmentByLevel(int level);
}
