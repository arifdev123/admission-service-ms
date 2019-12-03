package in.co.javacoder.admissionservicems.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.javacoder.admissionservicems.models.Patient;
import in.co.javacoder.admissionservicems.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> getAll() {
		Iterable<Patient> patientList = patientRepository.findAll();
		List<Patient> patient = new ArrayList<>();
		patientList.forEach(p->patient.add(p));
		return patient;
	}

	public Patient getById(Integer id) {
		return patientRepository.findById(id).get();
	}
}
