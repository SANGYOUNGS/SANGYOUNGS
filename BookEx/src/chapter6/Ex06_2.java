package chapter6;



public class Ex06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  cal(7, 3);
	      cal(-5, -3);
	      cal(4, -3);
	}
	public static void cal(int a , int b) {
		if(b > a) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a - b);
	}

}
