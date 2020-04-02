package com.test.springAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.test.springAnno" )
public class Config {
	
//	@Bean	
//	public Doctor getDoctor()
//	{
//		return new Doctor();
//	}
//	
//	@Bean	
//	public Equipments getequipments()
//	{
//		return new Equipments();
//	}

}
