package in.co.javacoder.admissionservicems.integration.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer id;
	private String firstname;
	private String lastname;
	private String designation;

	public Employee() {

	}

	public Employee(int id, String firstname, String lastname, String designation) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
