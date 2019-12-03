package in.co.javacoder.admissionservicems.integration.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disease {

	@Id
	private Integer id;
	private String name;
	private String treatment;

	public Disease() {

	}

	public Disease(Integer id, String name, String treatment) {
		super();
		this.id = id;
		this.name = name;
		this.treatment = treatment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

}
