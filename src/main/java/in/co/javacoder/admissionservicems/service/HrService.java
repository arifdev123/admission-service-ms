package in.co.javacoder.admissionservicems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.javacoder.admissionservicems.integration.HrServiceRestConsumer;
import in.co.javacoder.admissionservicems.integration.dto.Employee;

@Service
public class HrService {

	@Autowired
	private HrServiceRestConsumer hrServiceRestConsumer;
	
	public Employee[] getEmployees() {
		return hrServiceRestConsumer.getEmployees();
	}
	
}
