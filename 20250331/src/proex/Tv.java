package proex;

public class Tv extends Product{
		
	public Tv() { // 부모 클래스의 생성자를 호출해서 가격을 결정
		super(100); // Tv 가격을 100만원으로 한다.
	}
	 @Override
	public String toString() { // Object 클래스 toSting() 메소드를 재정의
		return  "Tv";
	}
}
