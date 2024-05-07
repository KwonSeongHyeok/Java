package com.kh.example.practice6.model.vo;

public class Book {
	public String title;
	public String publisher;
	public String author;
	public 	  int price;
	public double discountRate;
	
	public Book() {
		
	}
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	public Book(String title, String publisher, String author,
				int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
		
	public void inform() {
		System.out.println("å�̸� : " + title);
		System.out.println("���ǻ� : " + publisher);
		System.out.println("������ : " + author);
		System.out.println("å���� : " + price);
		System.out.println("������ : " + discountRate);
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args) {
		System.out.println("kh������ ���� ���� ȯ���մϴ�.");
		
		Book book1 = new Book();
		book1.title = "�װ��� �˰�ʹ�.";
		book1.publisher = "SBS";
		book1.author = "������";
		book1.inform();
		
		Book book2 = new Book("5�� 32��", "kh T��", "T�� ��ü�ϵ�");
		book2.inform();
		
		Book book3 = new Book("Do it! �ڹ� ���α׷��� �Թ�", "�������ۺ���", "������", 16500, 0.34);
		book3.inform();
	}
}
