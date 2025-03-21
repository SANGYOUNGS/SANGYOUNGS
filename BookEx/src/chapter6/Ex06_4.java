package chapter6;

public class Ex06_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i <= 100; i++) {
			if(PrimeNumber(i));
				System.out.println(i);
		}

	}
	public static boolean PrimeNumber(int number) {
		  if(number== 1)
	           return false;
		for(int i=2; i < number; i++) {
			if(number % i ==0) 
				return false;
		}
		return true;
	}
}
