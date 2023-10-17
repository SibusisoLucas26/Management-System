package SystemManager.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SystemManager.system.repository.EntityRepository;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);

	}

	@Autowired
	private EntityRepository entityRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		SystemManager.system.entity.Employee employee1 = new SystemManager.system.entity.Employee(
				"Sibusiso",
				"Lucas",
				"Software engineer",
				"sbulucass@gmail.com");
		entityRepository.save(employee1);

		SystemManager.system.entity.Employee employee2 = new SystemManager.system.entity.Employee(
				"Melusi",
				"Thobani",
				"IT specialist",
				"Melusi@gmail.com");
		entityRepository.save(employee2);

	}

}
