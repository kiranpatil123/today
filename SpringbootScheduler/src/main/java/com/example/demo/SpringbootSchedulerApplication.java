package com.example.demo;

import java.lang.management.ManagementFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootSchedulerApplication {
	
	public static final String PID=null;

	public static void main(String[] args) {
		String jvmName = ManagementFactory.getRuntimeMXBean().getName();
		System.out.println(jvmName);
		String PID = jvmName.split("@")[0];
		SpringApplication.run(SpringbootSchedulerApplication.class, args);
	}

}
