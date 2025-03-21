package com.constr;
/*
 *  	this 란 특정 객체 내에서 자신이  생성되었을떄의 주소값 변수
 * 		객체의 주소는 생성전까지는 모르기 때문에 객체 생성 후 자신의 주소로 대체됨
 * 		
 * 		this() 
 * 			-현재 객체의 생성자를 의미한다.
 * 			- 생성자 안에서 오버로딩 된 다른 생성자를 호출할 경우에 사용된다.
 * 
 */
class ThisEx {
	
	public String getName() {
		return name;
	}
	public String getJumin() {
		return jumin;
	}
	public String getTel() {
		return tel;
	}
	private String name; 
	private String jumin;
	private String tel;
	
	public ThisEx() {
		this.name = "Guest";
		this.jumin = "000000-0000000";
		this.tel = "010-1234-1234";	
	}
	public ThisEx(String name) {
		this();
		this.name=name;
	}
	public ThisEx(String name, String jumin) {
		this(name);
		this.jumin = jumin;
	}
	public ThisEx(String name, String jumin,String tel) {
		this(name, jumin);
		this.tel = tel;
	}
}
	

public class ThisEx01 {

	public static void main(String[] args) {
		// 이름 , 주민번호, 전화번호
		ThisEx te = new ThisEx();
		
		System.out.println("Name : "+te.getName() );
		System.out.println("Tel : " +te.getTel());
		System.out.println("Jumin : " +te.getJumin() );
		
	}

}
