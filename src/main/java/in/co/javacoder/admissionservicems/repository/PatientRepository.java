package in.co.javacoder.admissionservicems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.javacoder.admissionservicems.models.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
