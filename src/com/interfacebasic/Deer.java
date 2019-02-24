package com.interfacebasic;

public class Deer implements Animal ,Fly{

	@Override
	public String walkingBehaviour() {
		return "some thing";
	}

	@Override
	public String flyBehaviour() {
		// TODO Auto-generated method stub
		return "fly";
	}

}
