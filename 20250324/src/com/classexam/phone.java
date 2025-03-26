package com.classexam;

public class phone {
	//멤버 필드
	private String name;
	private String tel;
	
	// 생성자
	public phone(String name, String tel){
		this.name = name;
		this.tel =tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
