package com.kh.RunnablePre;
					// implements Runnable
public class ���ʺ��� implements Runnable {
// �ʵ�
	int ��;
	
// �޼���
	// �ʼ� ������
	public ���ʺ���(int ��) {
		this.�� = ��;
	}
	
	// void run() sleep 1000�� try catch this.�� + "������ ����"
	@Override	// Runnable �������̽����� run() �� �ݵ�� �ۼ������ �ϴ� �޼���
	public void run() {
		
		System.out.println(this.�� + " ������ ����");
		
		try {
			
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// this.�� + "������ ����"
		System.out.println(this.�� + " ������ ����");

	}
	

	
}
