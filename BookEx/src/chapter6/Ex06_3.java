package chapter6;

public class Ex06_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("원 둘레(2.4): " + CircleRound(2.4));
        System.out.println("원 넓이(2.4): " + Circlearea(2.4));
	}
	public static double CircleRound(double rad) {
		final double PI = 3.14;
        return rad * rad * PI;
	}
	public static double Circlearea(double rad) {
		final double PI = 3.14;
        return rad * 2 * PI;
}

}
