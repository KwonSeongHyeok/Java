package com.kh.practice.list.library.model.vo;

public class Book {
	// title author category price
//�ʵ�
	private String title;
	private String author;
	private String category;
	private    int price;
	
//�޼���
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	public int getPrice() {
		return price;
	}
	
	//������ : �⺻
	public Book() {
	}
	//������ : �ʼ�
	public Book(String title, String author, String category, int price) {
		//super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public String toString() {
		return "å ���� : " + title + ", å ���� : " + author + ", å ī�װ� : " + category + ", å ���� : " + price;
	}
	//@Override
}
