package com.kh.oop.basic;

public class Animal { // ����

	// 1. �ʵ� �̸� ����
	public String name;
	public int age;
	
	// 2. �ʱ� ������
	public Animal() {
		
	}
	// 3. �ʼ� ������ String name, int age
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 4. ��� �޼��� 
	public void info(){
		System.out.println("�̸� : " + name + "\n"
						 + "���� : " + age);
		}
	
	// 5. ���� �޼���
	public static void main(String[] args) {
		// 1) �ʱ�����ڷ�
		Animal dog = new Animal();
		dog.name = "������";
		dog.age = 5;
		dog.info();
		
		//	2) �ʼ������ڷ�
		Animal cat = new Animal("�����" , 3);
		cat.info();
	}
	
}
