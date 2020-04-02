package com.test.springAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // org.springframework.beans.factory.NoUniqueBeanDefinitionException-- to avoid
			// the mentioned exception we use primary
public class Siemens implements Hospital {

	public void checkUp() {
		// TODO Auto-generated method stub
		System.out.println("Siemens");
	}

}
