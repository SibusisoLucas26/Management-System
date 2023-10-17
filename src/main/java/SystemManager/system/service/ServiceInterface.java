package SystemManager.system.service;

import java.util.List;

import SystemManager.system.entity.Employee;

public interface ServiceInterface {
	
	List<Employee> listEmply();
	
	Employee saveEmply(Employee employee);
	
	Employee getById(Long id);
	
	Employee editEmply(Employee employee);
	
	void deleteById(Long id);
	
	

}
