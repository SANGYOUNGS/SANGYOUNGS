package com.classexam;
import java.util.*;

class Cricle {
	private double x, y; // 좌표
	private int radius; // 반지름
	
	public Cricle(double x, double y , int radius) {
		this.x = x;
		this.y = y;
		this.radius =radius;
	}
	public void show() {
		System.out.print(" ( " + x +" , " + y + " ) " + radius) ;
	}
	public double getArea() {
		return Math.PI*radius;
	}
}

public class CircleManager {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cricle c[] = new Cricle[3];
				for(int i = 0; i < c.length; i++) {
					System.out.print("x , y , radius : " );
					// x 
					double x = sc.nextDouble();
					// y
					double y = sc.nextDouble();
					// 반지름
					int radius = sc.nextInt();
					c[i] = new Cricle(x ,y , radius);
				}
				//
				for
			int biggestIndex = 0;
			for(int i = 0; i < c.length; i++) {
				if(c[biggestIndex].getArea() < c[i].getArea()) {
					biggestIndex = i;
				}
			}
			System.out.println("가장 면적이 큰 원은");
			c[biggestIndex].show();
	}
}
	
// 실행 결과
/*
 *  3개의 Circle 객체 배열을 만들고 x y radus 값을 
 * 	읽어 3개의 객체를 만들고 show () 메소드를 이용하여 모두 출력하시오.
 * 
 *  x , y  , radus : 3.0 3.0  5
 * 	 x , y , radus : 2.5 2.7  6
 * 	x, y ,	radus : 5.0 2.0 4
 * (3.0)(3.0) 5
 * (2.5)(2.7) 6
 * (5.0)(2.0) 4
 */