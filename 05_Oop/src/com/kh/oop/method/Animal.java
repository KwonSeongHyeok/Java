package com.kh.oop.method;

public class Animal {
	// �ʵ�
	public String name;
	public int age;
	
	
	// �޼���
		// ������
	public Animal() {
		
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// return �޼���
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void info() {
		System.out.println("���� �̸� : " + name);
		System.out.println("���� ���� : " + age);
	}
	
	
	// ���θ޼���
	public static void main(String[] args) {
		/*Animal dog = new Animal("������", 1);
		
		System.out.println("������ �̸� : " + dog.getName());
		System.out.println("������ ���� : " + dog.getAge());

		Animal cat = new Animal("�����", 1);
		
		System.out.println("����� �̸� : " + cat.getName());
		System.out.println("����� ���� : " + cat.getAge());
		*/
		Animal dog = new Animal("������", 1);
		dog.info();
		
		Animal cat = new Animal("�����", 1);
		cat.info();
	}

}
