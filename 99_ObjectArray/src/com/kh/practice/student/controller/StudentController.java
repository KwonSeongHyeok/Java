package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	//5���� �� �迭�� ������ִµ� �л����� ������ּ���.
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;//���
//�޼���
	//������ : �⺻
	public StudentController() {
		//0��° �л� 4��° �л����� ���� �־��ֱ�
		sArr[0] = new Student("��浿", "�ڹ�", 100);
		sArr[1] = new Student("�ڱ浿", "���", 50);
		sArr[2] = new Student("�̱浿", "ȭ��", 85);
		sArr[3] = new Student("���浿", "����", 60);
		sArr[4] = new Student("ȫ�浿", "�ڹ�", 20);
	}
	
	//��ȯ �޼���
	public Student[] printStudent() {
		return sArr;
	}
	
	//�л����� ������ ��� ���ؼ� ������ ���
	public int sumScore() { //���� ���� �� ����
		int sum = 0;
		for(Student s : sArr) {
			sum += s.getScore();
		}
		//���������� ������ sumScore�� �θ��ٸ� ���� ���� ������ �����ְڴ� 
		return sum;
	}
	
	//������ �޾Ƽ� ��� ���ϱ�
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore(); //������ ���� ��� �л��� ���� ���� ���� �����ϴ� ���� 0
		avgArr[1] = avgArr[0] / sArr.length; //  ��� = ���� / ���л���
		return avgArr;
	}
	
	// �������� �迭�� ������� �ʰ� ��� ���ϱ�
	public double avgScore2() {
		double avgArr = sumScore() / sArr.length;
		return avgArr;
	}
		
	// �� �л��� �հ� ���θ� Ȯ���ϰ� ����ϴ� �޼���
	public void printPass() {
		for(Student s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + " �л���" + (s.isPassed() ? "�հ�" : "���հ�") + "�Դϴ�.");
		}
	}
	
	
}