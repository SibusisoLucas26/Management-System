package SystemManager.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SystemManager.system.entity.Employee;

public interface EntityRepository  extends JpaRepository<Employee, Long>{

}
