package com.kh.ThreadEx;


// Thread Ŭ���� �������� �۾� ����
public class ThreadEx2 extends Thread {
//�ʵ�
	int ��;
	
//�޼���
	//������ : �ʼ�
	public ThreadEx2(int ��) {
		this.�� = ��;
	}
	
	// void run
	public void run() {
		System.out.println(this.�� + " ������ ������~~");
		
		try {
			// 1�� ����̱� ������ ����ϴ� ���̿� ������ �߻��� �� �ֱ� ������ 1�� ��⿡ ���ܸ� �ɾ���
			Thread.sleep(1000); 
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
		System.out.println(this.�� + "������ ���� ��");
	}
	
}