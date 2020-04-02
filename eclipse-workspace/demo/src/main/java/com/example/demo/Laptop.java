package com.example.demo;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop {
	
	private String lid;
	private String lbrand;
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLbrand() {
		return lbrand;
	}
	public void setLbrand(String lbrand) {
		this.lbrand = lbrand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lbrand=" + lbrand + "]";
	}
	 public void getStore()
	 {
		 System.out.println("Velachery");
	 }

}
