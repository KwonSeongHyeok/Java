package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone {
// �ʵ�
	private String maker;

//�޼���
	//Setter
	public void setMaker(String maker) {
		this.maker = maker;
	}
	//Getter
	public String getMaker() {
		return maker;
	}
	
	// ������ : �⺻
	public SmartPhone() {
	}

	//������ : �ʼ�
	public SmartPhone(String maker) {
		this.maker = maker;
	}

	public String printinformation() {
		return"����Ŀ : " + maker;
	}
	
}
