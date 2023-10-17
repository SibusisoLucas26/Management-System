package SystemManager.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SystemManager.system.entity.Employee;
import SystemManager.system.repository.EntityRepository;

@org.springframework.stereotype.Service
public class Service  implements ServiceInterface{
	
	@Autowired
	private EntityRepository entityRepository;
	
	@Override
	public List<Employee> listEmply(){
		return entityRepository.findAll();
	}
	
	
	@Override
	public Employee saveEmply(Employee employee) {
		// TODO Auto-generated method stub
		return entityRepository.save(employee);
	}

	@Override
	public Employee getById(Long id) {
		// TODO Auto-generated method stub
		return entityRepository.findById(id).get();
	}

	@Override
	public Employee editEmply(Employee employee) {
		// TODO Auto-generated method stub
		return entityRepository.save(employee);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		entityRepository.deleteById(id);
	}

}
