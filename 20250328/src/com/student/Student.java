package com.student;

	public class Student extends Person {
	    public void set() {
	        age = 30;          // 부모 클래스의 age 설정
	        name = "가길동";   // 부모 클래스의 name 설정
	        height = 170;      // 부모 클래스의 height 설정
	        this.setWeight(76);     // 부모 클래스의 weight 설정
	    }
	    
	    public void prt() {
	        System.out.println("나이: " + age);
	        System.out.println("이름: " + name);
	        System.out.println("키: " + height);
	        System.out.println("체중: " + this.getWeight());
	    }
	    
	    public static void main(String[] args) {
	        Student s = new Student();
	        s.set();
	        s.prt();  // 출력 메서드 호출 추가
	    }
	}
