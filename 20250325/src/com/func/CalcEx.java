package com.func;

import java.util.*;

class Calc {

	public static int plus(int x, int y) {
		return x + y;
	}

	public static int min(int x, int y) {
		return x - y;
	}

	public static int mul(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}

	public static int per(int x, int y) {
		return x % y;
	}

	// 출력 기능
	public static void display(int a, char b, int c, int d) {
		System.out.println();
		System.out.print(a + " " + b + " " + c + " = " + d);
	}
}

public class CalcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int su1 = 0, su2 = 0, sum = 0;
		char yon = 0;

		System.out.print("첫번째 수 : ");
		su1 = sc.nextInt();
		do {
			System.out.print("연산자(+,-,*,/,%): ");
			yon = sc.next().charAt(0);
		} while (yon != '+' && yon != '-' && yon != '*' && yon != '/' && yon != '%');
		System.out.print("두번째 수 : ");
		su2 = sc.nextInt();

		switch (yon) {
		case '+':
			sum = Calc.plus(su1, su2);
			break;
		case '-':
			sum = Calc.min(su1, su2);
			break;
		case '*':
			sum = Calc.mul(su1, su2);
			break;
		case '%':
			sum = Calc.per(su1, su2);
			break;
		case '/':
			sum = Calc.div(su1, su2);
			break;
		}
		Calc.display(su1, yon, su2, sum);
	}
}
