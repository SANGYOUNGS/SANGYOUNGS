package com.inner;

public class A {
	int a;
	int b;
	String op;
	
	public A(int a, int b, String op) {
	        this.a = a;
	        this.b = b;
	        this.op = op;
	   }
	    
	    public void show(double result) {
	        System.out.printf("%d %s %d = %f" , a,op,b,result);
	    }
	}
