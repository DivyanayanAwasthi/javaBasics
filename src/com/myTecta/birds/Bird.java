package com.myTecta.birds;
public class Bird {

	
	@Override
	public String toString() {
		return "Bird [legs=" + legs + ", eyes=" + eyes + ", feathers=" + feathers + "]";
	}

	//Defined proeprties for this Tutor
	private String legs;
	
	private Integer eyes;
	
	private Integer feathers;
	
	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	public Integer getEyes() {
		return eyes;
	}

	public void setEyes(Integer eyes) {
		this.eyes = eyes;
	}

	public Integer getFeathers() {
		return feathers;
	}

	public void setFeathers(Integer feathers) {
		this.feathers = feathers;
	}

	public String flybehaviour() {
		
		return "zig zag ";
	}
	
}
