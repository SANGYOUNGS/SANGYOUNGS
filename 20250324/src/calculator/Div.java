package calculator;

public class Div {
		private int a;
		private int b;
		public void setValue(int a , int b) {
			this.a = a;
			this.b = b;
		}
		public int calculate() {
				int r = 0;
				try {
					r = a / b ;
				}catch(AbstractMethodError e) {
					System.out.println("0으로 나눌 수 없습니다.");
					System.exit(0);
				} 
				return r;
		}
}
