package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

// Product�� �����ͼ� �����ϴ� Ŭ����
public class Run {
	// ���� �޼���
	public static void main(String[] args) {
		// Product ��ü ��ó
		Product product = new Product();
		
		// ���� : ��� ������� ����귣��
		product.setpName("���");
		product.setPrice(2000);
		product.setBrand("����� ����");
		
		product.information();
		
		System.out.println("========= get �ҷ����� =========");
		System.out.println("�̸� : " + product.getpName());
		System.out.println("���� : " + product.getPrice());
		System.out.println("�귣�� : " + product.getBrand());
	}

}
