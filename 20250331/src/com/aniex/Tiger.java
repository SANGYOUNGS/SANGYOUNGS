package com.aniex;

public class Tiger extends Animal{
	
	private String name;
	
	public Tiger() {
		name = getClass().getSimpleName();
	}
	@Override
	public String scream() {
		return "크르릉 어흐흥";
	
	}
	@Override
	public String getName() {
		return name;
	}
	
}
