package com.kh.LambdaEx;
/*
 ���ٽ�(Lambda)
 Ŭ���������� �����ؼ� ����� �Լ��� �ϳ��� ������ ǥ���� ��
 �޼����� �̸��� �ʿ���� ������ �̸��� ��� �͸� �Լ�
 
 ������ �ۼ��ϴ� ���
 		 void  return
 			����������
 			  ��
 public		 ��ȯŸ��		�޼���� (�Ű�����) {
 		���๮
 }
 
 ���� ���
 (�Ű����� ���) -> {����� �ڵ� ����}
 () -> "   ";
 () -> {   };
 
 ����
 ����
 public String Hello() {
 	return "World";
 }
 ���ٽ�
 () -> "World";
 
 ���ٽ��� ���� : �ڵ带 �����ϰ� ���� �� ����
 ���ٽ��� ���� : ���ٽ��� �ʹ� �������� �ڵ� ����� ������ 
 
 :::
 
 * */
public class LambdaEx {
	private static int ���� = 0;
	
	
	public void �⺻������() { //���ʺ�����.java + ���ʺ�����.java
		for(int i = 0; i < 3; i++) {
			Runnable r = new Runnable() {
				@Override
				public void run() {
					synchronized (LambdaEx.class) {
						����++;
						System.out.println("���� : " + ����);
					}
				}
			};
			Thread t = new Thread(r);
			t.start();
		}
	}


	public void ���ٽ�����() {
		for(int i = 0; i < 5; i++) { // ���ʺ� �������̽� ���� void run ����
			Thread t = new Thread(() -> {
				synchronized(LambdaEx.class) {
					����++;
					System.out.println("���� : " + ����);
				}
			});
			t.start();
		}
	}

}






