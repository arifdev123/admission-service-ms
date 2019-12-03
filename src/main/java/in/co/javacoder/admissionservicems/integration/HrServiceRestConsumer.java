package in.co.javacoder.admissionservicems.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.co.javacoder.admissionservicems.integration.dto.Employee;

@Component
public class HrServiceRestConsumer {

	@Autowired
	private RestTemplate restTemplate;
	
	public Employee[] getEmployees() {
		ResponseEntity<Employee[]> response = restTemplate.getForEntity("http://hr-service/hr/employees", Employee[].class);
		Employee[] employees = response.getBody();
		
		return employees;
	}
	
}
