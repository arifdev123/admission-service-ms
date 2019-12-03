package in.co.javacoder.admissionservicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdmissionServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmissionServiceMsApplication.class, args);
	}

}
