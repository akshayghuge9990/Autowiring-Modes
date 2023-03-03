package com.BikkadIT.AutowiringModes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.AutowiringModes.service.ReportService;

@SpringBootApplication
public class AutowiringModesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutowiringModesApplication.class, args);
		ReportService bean = context.getBean(ReportService.class);
		bean.generateReport();
		
		
		
	}

}
