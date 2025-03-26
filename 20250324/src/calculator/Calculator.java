package calculator;

import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int a ,b ;
			String cal ;
			System.out.println("두 정수 와 연산자 입력 : ");
			a = sc.nextInt();
			b = sc.nextInt();
			cal = sc.next();
			
			switch (cal) {
			case "+":
					Add add = new Add();
					add.setValue(a, b);
					System.out.println(add.calculate());
					break;
			case "-" :
				sub Sub= new sub();
				Sub.setValue(a, b);
				System.out.println(Sub.calculate());
				break;
				
			case "*" :
				mul Mul = new mul();
				Mul.setValue(a, b);
				System.out.println(Mul.calculate());
				break;	
				
			case "/" :
				Div div = new Div();
				div.setValue(a, b);
				int d = div.calculate();
				System.out.println(d);
				break;		

			default: 
				System.err.println("잘못입력했습니다");
			}
	}
}
