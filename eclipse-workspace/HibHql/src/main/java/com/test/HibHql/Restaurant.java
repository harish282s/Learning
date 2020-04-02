package com.test.HibHql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
	
	@Id
	private int rid;
	private String rname;
	private int rrating;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public int getRrating() {
		return rrating;
	}
	public void setRrating(int rrating) {
		this.rrating = rrating;
	}
	@Override
	public String toString() {
		return "Restaurant [rid=" + rid + ", rname=" + rname + ", rrating=" + rrating + "]";
	}
	
	

}
