package com.test.springAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

	@Autowired
	@Qualifier("epson") // It will provide the required bean when we don't mention primary annotation
	Hospital hospital;

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public void getDoctor() {
		// TODO Auto-generated method stub

		System.out.println("I am a doctor");
		hospital.checkUp();

	}
}
