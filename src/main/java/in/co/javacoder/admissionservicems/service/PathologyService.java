package in.co.javacoder.admissionservicems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.javacoder.admissionservicems.integration.PathologyServiceRestConsumer;
import in.co.javacoder.admissionservicems.integration.dto.Disease;

@Service
public class PathologyService {

	@Autowired
	private PathologyServiceRestConsumer pathologyServiceRestConsumer;
	
	public Disease[] getDiseases() {
		return pathologyServiceRestConsumer.getDiseases();
	}
	
}
