package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

// ������� ���忡�� �ٶ󺸴� ��ǻ��
public class StudentMenu {
	private StudentController ssm = new  StudentController();
// �޼���
	// ������ : �⺻
	public StudentMenu() {
		
	}
	// void �л������� ���� ��� ����ϴ� �޼���
	public void printStudentMenu() {
		System.out.println("�л� �̸�\t    ����\t      ����");
		System.out.println("--------------");
		// for - each
		// String���� �ߴٸ� �л��� �̸� or ���� or ���� �� �ϳ�
		// Student �̸��� ����� ������ ���~~~ ������ ���ڴٴ� �ǹ�
		/*		[  , ,  ]		 �� �� �� �� ȫ �浿 */
		for(Student student : ssm.printStudent()) {
			System.out.println(student.inform());
		}
		System.out.println("--------------");
		System.out.println("���� : " + ssm.sumScore());
		System.out.printf("��� : %.2f \n", ssm.avgScore()[1]);
		System.out.println("�հݿ��� : " + (ssm.avgScore()[1] >= StudentController.CUT_LINE));

		ssm.printPass();
	}
	/*
	 * boolean�� �Ἥ true���� false ������ ������ ���µ�
	 * 	true�� false�� �������ϱ�?
	 * 	  ssm.avgScore()[1] >= StudentController.CUT_LINE
	 *			80						60
	 * 		���� ũ�ų� �۴ٴ� ���� ǥ���ϴ� �ε�ȣ�� true���� false���� ���и� �ϱ� ���� ����
	 * 
	 * */
	
}
