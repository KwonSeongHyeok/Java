package com.kh.example.practice1.model.vo;

public class Member {
	// �ʵ�
	public String memberId;	  // ���̵�
	public String memberPwd;  // ��й�ȣ
	public String memberName; // �̸�
	public	  int age;		  // ����
	public 	 char gender;	  // ����
	public String phone;	  // �ڵ�����ȣ
	public String email;	  // �̸���
	
	// ������ �޼���
	public Member() {
		
	}
	
	// ��� �޼���
	public void changeName(String name) {
		this.memberName = name;
		System.out.println("����� �̸� : " + name);
	}
	
	// ���� �޾Ƽ� �����ϴ� �޼���
	public String changeEamil(String �����̸���) {
		this.email = �����̸���;
		
		return email;
	}
	
	public void printName() {
		System.out.println("�̸� : " + memberName);
	}
	// ctrl + s
	
	
}
