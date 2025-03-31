package proex;

public class PoltEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		/*
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		/*
		/*
		 * // System.out.println("현재  남은 돈은 " + b.money + "만원입니다."); //
		 * System.out.println("현재 포인트 점수는 " +b.bonusPoint + "입니다.");
		 */
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(audio);
		b.summary();
		
	}

}
