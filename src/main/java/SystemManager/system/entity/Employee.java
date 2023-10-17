package SystemManager.system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String workDepartment;
	
	@Column(nullable = false)
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getWorkDepartment() {
		return workDepartment;
	}

	public void setWorkDepartment(String workDepartment) {
		this.workDepartment = workDepartment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee(Long id, String firstName, String lastName, String workDepartment, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.workDepartment = workDepartment;
		this.email = email;
	}

	public Employee(String firstName, String lastName, String workDepartment, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.workDepartment = workDepartment;
		this.email = email;
	}
	
	public Employee() {}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", workDepartment="
				+ workDepartment + ", email=" + email + "]";
	}
	
	

}
