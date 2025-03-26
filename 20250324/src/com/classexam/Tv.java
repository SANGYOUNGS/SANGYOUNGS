package com.classexam;

// 클래스개념 , 멤버 필드 ,메서드 , 

	public class Tv { 
	private String model;
	private int year;
	private int inch;

	public Tv(String model, int year , int inch) { // 생성자
	this.model = model;
	this.year = year;
	this.inch =inch;
	}
	public void show() { // 메소드
		// Lg에서 만든 2025년형 32인 TV
		System.out.println(model + " 에서 만든 " + year + " 년형 " + inch + " 인치 TV");
	}
	
	public static void main(String[] args) {
		Tv myTv = new Tv("Lg" , 2025 , 32);
		myTv.show();
		}
	}
