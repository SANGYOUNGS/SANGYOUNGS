package exam;

public class Rectangle extends Shape{

	
 @Override
 	public void calcArea() {
	 	System.out.println("사각형의 넓이 : " + d1 * d2);
 	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.calcArea();
	}		
}

