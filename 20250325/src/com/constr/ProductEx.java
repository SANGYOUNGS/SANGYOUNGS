package com.constr;

class Product {
	static int count = 0;
	int serialNo;
	{
	count++;
	serialNo = count;
	}
	public Product() {
		
	}
}


public class ProductEx {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 제품번호는 " +p1.serialNo);
		System.out.println("p2 제품번호는 " +p2.serialNo);
		System.out.println("p3 제품번호는 " +p3.serialNo);
		System.out.println("만들어진 제품 수는 " + Product.count + "개입니다.");
	}
}
