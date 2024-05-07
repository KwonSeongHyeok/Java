package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	// Ű���� �� �Է¹��� scanner
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	// Book�� �������ڸ��� ���̴� ���θ޴� �����
	public void mainMenu() {
		// ���࿡ true��� ��ӽ���
		while(true) {
			System.out.println(" === �������� ���α׷� === ");
			System.out.println("1. �����߰�");
			System.out.println("2. ���� ��ü ��� ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("6. ����");
			System.out.print("�޴����� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				insertBook();
				break;
			case 2 :
				selectList();
				break;
			case 3 :
				searchBook();
				break;
			case 4 :
				deleteBook();
				break;
			case 5 :
				ascBook();
				break;
			case 6 :
				System.out.println("���α׷��� ����˴ϴ�.");
				return;
			default :
				System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���");
			}
		}
	}
	
	public void selectList() {
		bc.selectList();
	}
	
	
	
	// å �߰��ϱ� ���� Ű����� �ۼ��ϴ� insertBook void �����
	public void insertBook() {
		System.out.print("���� : ");
		String title = sc.nextLine();
		
		System.out.print("���� : ");
		String author = sc.nextLine();
		
		System.out.print("ī�װ� : ");
		String category = sc.nextLine();
		
		System.out.print("���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		// å ���� �����ϴ� Book ��ü ��ȯ
		//						����,		����,		ī�װ�,	����
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
		System.out.println("���� �߰��� �Ϸ� �Ǿ����ϴ�.");
	}
	
	// ���� �˻�
	public void searchBook() {
		System.out.print("�˻��� Ű���� �Է� : ");
		String keyword = sc.nextLine();
		bc.searchBook(keyword);
	}
	
	// ���� ����
	public void deleteBook() {
		System.out.print("������ ���� ��� : ");
		String title = sc.nextLine();
		System.out.print("������ ���� ���� : ");
		String author = sc.nextLine();
		
		//BookController ���� �����ϴ� ��� �߰�
		bc.deleteBook(title, author);
	}
	
	// ��������� �������� ����
	// ascending ��������
	public void ascBook() {
		//BookController ���� ������������ �����ϴ� ��� �߰�
		bc.ascBook();
	}
	
}
