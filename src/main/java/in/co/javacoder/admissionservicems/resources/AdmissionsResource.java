package in.co.javacoder.admissionservicems.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.co.javacoder.admissionservicems.integration.dto.Disease;
import in.co.javacoder.admissionservicems.integration.dto.Employee;
import in.co.javacoder.admissionservicems.models.Patient;
import in.co.javacoder.admissionservicems.service.HrService;
import in.co.javacoder.admissionservicems.service.PathologyService;
import in.co.javacoder.admissionservicems.service.PatientService;

@RestController
@RequestMapping("/admissions")
public class AdmissionsResource {

	@Autowired
	private PatientService patientService;
	
	@Autowired
	private PathologyService pathologyService;
	
	@Autowired
	private HrService hrService;

	@GetMapping("/patients")
	@ResponseBody
	public ResponseEntity<List<Patient>> getPatient() {
		return ResponseEntity.ok(patientService.getAll());
		//return patientService.getAll();
	}

	@GetMapping("/patients/{id}")
	public Patient getPatient(@PathVariable Integer id) {
		return patientService.getById(id);
	}
	
	@GetMapping("/employees")
	public Employee[] getEmployees() {
		return hrService.getEmployees();
	}
	
	@GetMapping("/diseases")
	public Disease[] getDiseases() {
		return pathologyService.getDiseases();
	}
	
	
}
