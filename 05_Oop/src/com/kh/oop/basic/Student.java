package com.kh.oop.basic;

public class Student {
	// �ʵ�		String name int age int grade
	// �л��ε� �л��� �̸��� 			���̿�	 �г�
	public String name;
	public int age;
	public int grade;
	
	// ������ �޼���(�ʼ��� �ۼ��ؾ��ϴ� ������ �޼��� �����)
	// �ʼ��� �־���ϴ� �� �̸� ���� �г�

	public Student(String �̸�, int ����, int �г�) {
		this.name = �̸�;
		this.age = ����;
		this.grade = �г�;
	}
	
	// ��� �޼��� ���� ��� �޼���
	public void info(){
		System.out.println("�̸� : " + name + "\n���� : " + age + "\n�г� : " + grade);
	}
	
	// ���� ���� �޼���
		// �л� ��ü �����ϱ�   ��ö�� 18 3 / �ڿ��� 20 2
		// Student student1
		// Student student2
		// �л�1�� �л�2 ���� ����ϱ�
	public static void main(String[] args) {
		Student student1 = new Student("��ö��", 18, 3);
		Student student2 = new Student("�ڿ���", 20, 2);
		student1.info();
		student2.info();
	}
	
}
