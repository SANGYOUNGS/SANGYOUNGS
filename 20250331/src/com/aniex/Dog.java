package com.aniex;

public class Dog extends Animal{
	
	private String name;
	
	public Dog() {
			name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		return ("멍멍 깨갱");
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	
	
}
