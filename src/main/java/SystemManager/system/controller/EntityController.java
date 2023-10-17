package SystemManager.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import SystemManager.system.entity.Employee;
import SystemManager.system.service.ServiceInterface;

@Controller
public class EntityController {

	@Autowired
	private ServiceInterface serviceInterface;

	/////////////////////// Get methods
	@GetMapping("/employee")
	public String listEmply(Model model) {
		model.addAttribute("employees", serviceInterface.listEmply());
		return "EmployeeView";
	}

	//////////////////////////////////////////////////////////
	@GetMapping("/employee/new")
	public String newEmply(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "New";
	}

	////////////////////////////////////////////////////////////////
	@GetMapping("/employee/edit/{id}")
	public String editEmply(@PathVariable Long id, Model model) {
		model.addAttribute("employee", serviceInterface.getById(id));
		return "Edit";
	}

	@GetMapping("/employee/delete/{id}")
	public String deleteById(@PathVariable Long id) {
		serviceInterface.deleteById(id);
		return "redirect:/employee";
	}

	@GetMapping("/")
	public String runTest() {
		return "Test";
	}

	////////////////////// POst methods
	@PostMapping("/employees")
	public String saveEmply(@ModelAttribute() Employee employee) {
		serviceInterface.saveEmply(employee);
		return "redirect:/employee";
	}

	@PostMapping("/employee/{id}")
	public String update(@PathVariable Long id,
			@ModelAttribute("employees") Employee employee,
			Model model) {

		Employee emplyFromDataBasEmployee = serviceInterface.getById(id);
		emplyFromDataBasEmployee.setFirstName(employee.getFirstName());
		emplyFromDataBasEmployee.setLastName(employee.getLastName());
		emplyFromDataBasEmployee.setWorkDepartment(employee.getWorkDepartment());
		emplyFromDataBasEmployee.setEmail(employee.getEmail());

		serviceInterface.editEmply(emplyFromDataBasEmployee);
		return "redirect:/employee";

	}
}
