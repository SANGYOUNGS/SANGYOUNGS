package exam;

public class Circle extends Shape {

	@Override
	public void calcArea() {
		System.out.println("원의 넓이 : " + d1 * d2 * 3.14);
	}
	// 오버 로딩
	public void calcArea(double d3 ,double d4) {
		System.out.println("원의 넓이 : " + d3 * d4 * 3.14);
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.calcArea();
		c.calcArea(40,40);
	}
}
