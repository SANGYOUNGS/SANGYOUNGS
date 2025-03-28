package com.inner;

import java.util.*;
public class B extends A {
	Scanner sc = new Scanner(System.in);
	public B() {
			super(0,0,"");
			System.out.println("숫자를 입력해주세요");
			this.a = sc.nextInt();
			System.out.print("숫자를 입력해주세요");
			this.b = sc.nextInt();
			System.out.println("연산자를 입력해주세요");
			this.op = sc.next();
			sc.close();
	}	
	public void cal() {
		double result = 0;
	        switch(op) {
	            case "+":
	                result = a + b;
	                break;
	            case "-":
	                result = a - b;
	                break;
	            case "*":
	                result = a * b;
	                break;
	            case "/":
	                result = (double)a / b;
	                break;
	            default:
	                System.out.println("지원하지 않는 연산자입니다.");
	                return;
	        }
	        show(result);
	    }
	}
