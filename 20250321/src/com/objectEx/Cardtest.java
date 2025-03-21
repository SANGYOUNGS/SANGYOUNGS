package com.objectEx;

public class Cardtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.heigh = " + Card.height);
		
		Card c1 = new Card();
		c1.kind ="Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind ="Spade";
		c2.number = 4;
	
		System.out.println("Card1: " + c1.kind+ " ," +c1.number +" 이며" + "크기는(" + c1.width + "," + c1.height + ")입니다" );
		System.out.println("Card2: " + c2.kind+ " ," +c2.number +" 이며" + "크기는(" + c2.width + "," + c2.height + ")입니다" );
		
		System.out.println("Card1 의 Width와 height를 각각 50 , 80으로 변경하시오.");
		
		c1.width = 50;
		c1.height = 80;
		System.out.println("Card1: " + c1.kind+ " ," +c1.number +" 이며" + "크기는(" + c1.width + "," + c1.height + ")입니다" );
		System.out.println("Card2: " + c2.kind+ " ," +c2.number +" 이며" + "크기는(" + c2.width + "," + c2.height + ")입니다" );

		
	}
}
