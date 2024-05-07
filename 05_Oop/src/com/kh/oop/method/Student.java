package com.kh.oop.method;

public class Student {
	// �ʵ�
	// �л� �̸� ���� �г�
	private String name;
	private int age;
	private int grade;
	
	// �޼���
	 // ������ : �⺻
	public Student() {
		
	}
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	// return
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getGrade() {
		return grade;
	}
	public void info() {
		System.out.println("�л��� �̸� : " + name);
		System.out.println("�л��� ���� : " + age);
		System.out.println("�л��� �г� : " + grade);
	}
	
	public static void main(String[] args) {
		
		
		Student student1 = new Student("�ڿ���", 15, 2);
		Student student2 = new Student("�迵��", 17, 1);
		student1.info();
		student2.info();
	}

}
