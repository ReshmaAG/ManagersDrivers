package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.DriverInfo;
import com.example.demo.repository.ManageDriversRepository;

@SpringBootApplication
public class ManageDriversApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageDriversApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner runner() {
//		
//		return new CommandLineRunner() {
//			
//			@Autowired
//			ManageDriversRepository repo;
//
//			@Override
//			public void run(String... args) throws Exception {
//				// TODO Auto-generated method stub
//				
//				@SuppressWarnings("deprecation")
//				Date date1 = new Date(11,28,2021,0,0);
//				DriverInfo driver1 = new DriverInfo("Raja",374687,"jhf3648",date1);
//				this.repo.save(driver1);
//				
//			}
//			
//			
//		};
//	}

}
