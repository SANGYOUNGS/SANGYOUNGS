package com.ex;

public class MemberEx {

	public static void main(String[] args) {
	Member m = new Member();
	Myinfo i = new Myinfo();
/*		m.name ="홍길동";
		m.age = 34;
		m.gender='남';
		m.tel="010-1111-1111";
		m.addr="서울특별시 영등포구 영종로 4가 글로벌인";
		
		System.out.printf("이름%s :" + m.name);
		System.out.println("나이 : " + m.age);
		System.out.println("성별 : " + m.gender);
		System.out.println("전화번호 : " + m.tel);
		System.out.println("주소 : " + m.addr);
*/
		System.out.printf("이름 :%s%n", m.name);
		System.out.printf("나이 :%d%n", m.age);
		System.out.printf("성별 :%c%n", m.gender);
		System.out.printf("전화번호 :%s%n", m.tel);
		System.out.printf("주소 :%s%n", m.addr);
		
		System.out.printf("이름 :%s%n", i.names[0]);
		System.out.printf("나이 :%d%n", i.ages[0]);
		System.out.printf("성별 :%c%n", i.genders[0]);
		System.out.printf("주소 :%s%n", i.addrs[0]);
		System.out.printf("이름 :%s%n", i.names[1]);
		System.out.printf("나이 :%d%n", i.ages[1]);
		System.out.printf("성별 :%c%n", i.genders[1]);
		System.out.printf("주소 :%s%n", i.addrs[1]);
		
	}
}
