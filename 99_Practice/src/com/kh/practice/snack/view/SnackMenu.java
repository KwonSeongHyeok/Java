package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	// ���� �޴��� �Է��ϰ� ���� â
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kind = sc.next();
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�� : ");
		String flovor = sc.next();
		System.out.print("���� : ");
		int numOf = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();
		
		System.out.println("������ ������ Ȯ���Ͻðڽ��ϱ�?(y / n)");
		String answer = sc.next();
		
		// ���࿡ y ������ ���峻�� ���
		// equlasIgnoreCase ��ҹ��� ������� �� ���ڿ��� ���ϴ� �� ���
		if(answer.equalsIgnoreCase("Y")) {
			// ������ ���� ���
			System.out.println(scr.saveData(kind, kind, flovor, numOf, price));
			// ���� ���� �� ���� �� Ȯ��
			System.out.println(scr.confirmData());
		}
	}
}
