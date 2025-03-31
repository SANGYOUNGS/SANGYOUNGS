package com.aniex;

public class HospitalMain {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat =  new Cat();
		Animal tiger = new Tiger();
		
		Hospital h = new Hospital();
		h.inject(dog);
		h.inject(cat);
		h.inject(tiger);

	}

}
