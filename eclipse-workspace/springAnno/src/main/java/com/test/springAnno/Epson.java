package com.test.springAnno;

import org.springframework.stereotype.Component;

@Component
public class Epson implements Hospital {

	public void checkUp() {

		System.out.println("Epson");
	}

}
