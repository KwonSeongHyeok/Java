package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone {
// 필드
	private String maker;

//메서드
	//Setter
	public void setMaker(String maker) {
		this.maker = maker;
	}
	//Getter
	public String getMaker() {
		return maker;
	}
	
	// 생성자 : 기본
	public SmartPhone() {
	}

	//생성자 : 필수
	public SmartPhone(String maker) {
		this.maker = maker;
	}

	public String printinformation() {
		return"메이커 : " + maker;
	}
	
}
