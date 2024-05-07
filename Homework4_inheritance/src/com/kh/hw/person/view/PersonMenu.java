package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	// ��������� ���ڸ� �Է¹ް�
	Scanner sc = new Scanner(System.in);
	//1qjs �����Ʈ�ѷ� ��������
	PersonController pc = new PersonController();
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("=== ���θ޴� ===");
			System.out.println("1. �л� �޴�");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();
			sc.nextLine(); // �����ִ� enter ���ֱ�
			
			// ��ȣ�� ������ �� �ִ� switch ��ȯ
			switch(choice) {
			case 1 :
				studentMenu();
				break;
			case 0 :
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	
	// �л��� �߰��ϰų� ��ȸ�� ��
	public void studentMenu() {
		while(true) {
			System.out.println("=== �л� �޴� === ");
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ���");
			System.out.println("0. ���� �޴���");
			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 0:
				System.out.println("���� �޴��� �̵��մϴ�.");
				return;
			default : 
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	
	public void insertStudent() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("������ : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		String major = sc.nextLine();
		
		// 2��°�� �л��߰� �ֱ�
		pc.insertStudent(name, age, height, weight, grade, major);
		
		System.out.println("�л��� �߰��Ǿ����ϴ�.");
	}

	// �л��� �󸶳� �����ϴ��� ����ϱ�
	public void printStudent() {
		// �л������� ����ִ� Student ��ٱ��� ����� �迭 ��������
		Student[] students = pc.printStudent();
		System.out.println("=== �л���� ===");
		
		// for - each
		for(Student s : students) {
			// ���࿡ �ȿ��� ������� �ʴٸ� �И����� ������ ��
			if(s != null) {
				System.out.println(s);
			} else {
				System.out.println("������ �л� ������ �����ϴ�.");
			}
		}
	}


}

