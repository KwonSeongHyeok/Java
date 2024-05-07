package com.kh.ThreadEx;
/*
 process : program + success = ���α׷� ���� ����! �׸��� ���α׷� ������
 Thread(������) : ��
 ������� ��ǻ�Ϳ��� ������ �۾��� �����ϴ� ���� �ǹ�
 
 �� �� �̻��� �����带 ������ ���μ����� ��Ƽ������
 
 �����带 �����ϴ� ���
 1.Runnable �������̽� ���  Ŭ������ ���� implements Runnable
 
 2.Thread Ŭ���� ��ӹޱ�	Ŭ������ ���� extends Thread
 	 �޼���� ������� �����带 ������ ���� start() ����ؾ��� ������ �� ����
 	 �����忡�� ������ �����尡 ��ǻ�� �ȿ��� �����ǰ� ���۵Ǵ� ������ ���� �޶���
 	 
 ������� �⺻���� �켱������ 5
 �켱������ 1~10 ���� ����
 setPriority(Thread.MIN_PRIORITY);
 
 Thread.MIN_PRIORITY  = �켱���� 1		= CPU �ڿ��� ���� ���� Ȯ��
 Thread.NORM_PRIORITY = �켱���� 5 (�⺻)
 Thread.MAX_PRIORITY  = �켱���� 10	= CPU �ڿ��� �� ���� Ȯ��
 
 ���࿡ �켱�������� 1 5 10 �̿��� �켱������ ����ϰ� �ʹٸ�
 
 ���࿡ �켱���� 3���� �ΰ�ʹ�
 setPriority(3);
 ���࿡ �켱���� 6���� �ΰ�ʹ�
 setPriority(6);
 
 �����忡�� ���ϴ� �켱������ CPU �ڿ��� �� ���� Ȯ���ϴ� �켱����
 �켱������ ���� �����尡 �׻� ���� ����Ǵ� ���� �ƴ�
 
   sleep() : ~~�� �� ���ڴ� ���� ����
   			 �� �˾Ƽ� ~~�� �� ����
   			   			 
 // ���� ����� ��������� ���� �ֱ�� ������ ����x
 suspend() : �Ͻ� ����
 			 �� �˾Ƽ� �Ͼ�� X resume���� �Ͼ���� ���� ����
 			 
  resume() : �Ͻ� ������ ������ �ٽ� ����
 
 
 
  wait() : Ư�� ������ ������ ������ ���
Notify() : ��� ���� �����带 ���� Ư�� �۾��� �����ϵ��� ��



await()  : Condition ���� �����带 �Ͻ������� ���
signal() : await�� ���� ����ϰ� �ִ� �����带 ����
 
 
 
 * */
public class ThreadEx extends Thread {

	public void run() {
		System.out.println("������ ���� ��");
		
		try {
			
			Thread.sleep(5000); // 1�ʵ��� ����
			
			System.out.println("5�� ��!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}
