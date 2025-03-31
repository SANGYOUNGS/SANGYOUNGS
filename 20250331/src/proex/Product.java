package proex;

public class Product {
	
	int price; // 제품의 가격
	int bonusPoint; // 제품 구마새 제공하는 포인트 점수
	
	public Product()  {
		price = 0 ;
		bonusPoint = 0;
	}
	
	
	public Product (int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0); // 제품 가격의 10%	
	}
}
