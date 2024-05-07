package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
// �޼���
	// �⺻ ������
	public ArrayListEx2(){
		
	}
	
	public void method1() {
		// ���� �ٳ��� ���
		ArrayList<String> list = new ArrayList<>();
		
		// add�� ����ؼ� ���� �ٳ��� ��� �߰�
		list.add("����");
		list.add("�ٳ���");
		list.add("���");
		
		// get 0 1 2 ����ؼ� �� index �ڸ��� �� ����ϱ�
		System.out.println("list.get(0) : " + list.get(0));
		System.out.println("list.get(1) : " + list.get(1));
		System.out.println("list.get(2) : " + list.get(2));
		
		// set �ٳ��� -> Ű�� ����
		list.set(1, "Ű��");
		
		// size�� �̿��ؼ� ũ�� Ȯ��
		// size() ���ڸ� ���� ���� size() ���
		System.out.println("�ٱ��� ũ�� : " + list.size());

		// remove Ű�� ����
		list.remove(1);
		
		// isEmpty() ����ִ��� Ȯ��
		System.out.println("��ٱ��� ��� �ֳ���? : " + list.isEmpty());
		
		// ��ٱ��� ���� �� �ִ��� Ȯ��!
		// ������ ����� for ��
		for(String ���� : list) {
			System.out.println(����);
		}
	}
	
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		
		// ����Ű ���� �����ؼ� �ؿ� �ٿ��ֱ� ����� ctrl + alt + ��
		// add ���� ȣ���� ����� ������
		animal.add("����");
		animal.add("ȣ����"); 
		animal.add("�����"); 
		animal.add("������"); 
	
		
		// size() ������ ��� �ִ��� Ȯ��
		System.out.println(animal.size());
		
		// get ���� ���� Ȯ��
		for(int i = 0; i < animal.size(); i++) {
			System.out.println("���� " + i + " : " + animal.get(i));
		}

		// set ����� -> �䳢�� ����
		animal.set(2, "�䳢");
		
		// remove ������ ����
		animal.remove("������");
		
		// for���� Ȱ���ؼ� get ���
		for(String name : animal) {
			System.out.println("����! : " + name);
		}
		
		// clear ����ؼ� ��� ����
		animal.clear();
		
		// isEmpty() ��� ������ �ƴ��� Ȯ��
		System.out.println("��� �̻��մϴ�.");
		System.out.println("�������� ��� ����ֳ���? " + animal.isEmpty());
	}
	
	
	public void method3() {
		// ���� ����
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== ���ڸ޴� ===");
		// add �������� ������������ ���۷δ�����
		pizza.add("����");
		pizza.add("��������");
		pizza.add("���۷δ�");
		
		// ��κ���
		System.out.println("��� �޴� ���� : " + pizza);
		
		// get�� Ȱ���ؼ� ���
		System.out.println(pizza.get(0));
		System.out.println(pizza.get(1));
		System.out.println(pizza.get(2));
		
		// set Ȱ���ؼ� ���۷δ� -> ���ξ���
		pizza.set(2, "���ξ�������");
		
		// remove ���ξ���
		pizza.remove("���ξ�������");
		
		// for�� Ȱ���ؼ� ���
		for(String p : pizza) {
			System.out.println("���� : " + p);
		}
		System.out.println("���ڰ��԰� ����� �����Դϴ�.");
		// �޴� ��� ���� clear()
		pizza.clear();
		// �޴� ��� �赥�ɴ��� Ȯ�� isEmpty((
		System.out.println(pizza.isEmpty());
	}
	
	
	// ���� : �������� �����ϰ� ����ϴ� �޼���
	public static void main(String[] args) {
		ArrayListEx2 ae = new ArrayListEx2();
		//ae.method1();
		//ae.method2();
		ae.method3();
	}

}
