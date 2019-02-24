package com.myTectra.animals;

import java.sql.ClientInfoStatus;

public class Animal {
	
	public Animal() {}
 
	 public Animal(Animal client) {
			
			this.legs=client.getLegs();
			this.veg=client.getVeg();
			this.head=client.getHead();
		}
		
	
	
	
	 private Integer head;
	public Integer getHead() {
		return head;
	}

	public void setHead(Integer head) {
		this.head = head;
	}




	private Integer legs;
	
	private  Boolean veg;

	public Integer getLegs() {
		return legs;
	}

	public void setLegs(Integer legs) {
		
		this.legs = legs;
	}

	public Boolean getVeg() {
		return veg;
	}

	public void setVeg(Boolean veg) {
		this.veg = veg;
	}
	
	protected String walkingBehvaior() {
		
		return "walks strainght";
	}
	
}
