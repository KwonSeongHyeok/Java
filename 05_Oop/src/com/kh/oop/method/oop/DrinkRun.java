package com.kh.oop.method.oop;

public class DrinkRun {
	// ���� �޼���
	public static void main(String[] args) {
		// ���� ���� ��ü ����
		DrinkMaker tea = new DrinkMaker("���Ƽ", 1, 5);
		// ���� ���� ��ü ����
		DrinkStore st = new DrinkStore(tea, "���", "�߾�Ŀ��", false);
		
		st.orderDrink();
		System.out.println("-------------------------");
		
		DrinkMaker cof = new DrinkMaker("�Ƹ޸�ī��", 3, 1);
		
		DrinkStore st2 = new DrinkStore(cof, "���� ���ʱ�", "�����ڷ���", true);
		
		st2.orderDrink();
	}
}
