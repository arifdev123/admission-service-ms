package in.co.javacoder.admissionservicems.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.co.javacoder.admissionservicems.integration.dto.Disease;

@Component
public class PathologyServiceRestConsumer {

	@Autowired
	private RestTemplate restTemplate;
	
	public Disease[] getDiseases() {
		ResponseEntity<Disease[]> response = restTemplate.getForEntity("http://pathology-service/pathology/diseases", Disease[].class);
		Disease[] disease = response.getBody();
		
		return disease;
	}
	
}
