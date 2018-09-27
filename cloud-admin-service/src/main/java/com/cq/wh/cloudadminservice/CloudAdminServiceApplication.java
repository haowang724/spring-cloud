package com.cq.wh.cloudadminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAdminServiceApplication.class, args);
	}
}
