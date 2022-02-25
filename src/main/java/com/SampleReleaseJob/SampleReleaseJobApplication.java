package com.SampleReleaseJob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.SampleReleaseJob.SampleReleaseJobApplication;

@SpringBootApplication
public class SampleReleaseJobApplication  extends SpringBootServletInitializer  {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(SampleReleaseJobApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleReleaseJobApplication.class, args);
	}

}
