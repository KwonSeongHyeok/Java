package com.kh.imageEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImagePR2 {
	
	
// ����ȭ�鿡 �̹������� / �����̸�.txt���� ������� ��
	public void method1() {
		String ������� = "c:/Users/user1/Desktop/�̹���";

		File ���� = new File(�������);
			
		if(����.exists()) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			����.mkdir();
			System.out.println(����.getName() + "������ ���� �Ǿ����ϴ�.");
		}

		
		File �ؽ�Ʈ = new File(���� + "/�����̸�.txt");
		
		if(�ؽ�Ʈ.exists()) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			try {
				�ؽ�Ʈ.createNewFile();
				System.out.println(�ؽ�Ʈ.getName() + "������ �����Ǿ����ϴ�.");
			} catch (IOException e) {
				System.out.println("���� ������ �����߽��ϴ�.");
				e.printStackTrace();
			}
		}
		// �� ����� ���� �䳢 ȣ���� �����̸��� ����� �� ������
		try {
			FileWriter �۾��� = new FileWriter("�����̸�.txt");
			
			String ���� = "��\n�����\n����\n�䳢\nȣ����\n";
			
			�۾���.write(����);
			�۾���.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		File �̸����� = new File(����ȭ���� + "/�̹���/ȣ����.txt");
		
		if(�ؽ�Ʈ.exists()) {
			if(�ؽ�Ʈ.renameTo(�̸�����)) {
				System.out.println("���� �̸��� ���������� ����Ǿ����ϴ�.");
			} else {
				System.out.println("���� �̸� ���濡 �����߽��ϴ�.");
			}
		} else {
			System.out.println("���� �̸��� �������� �ʽ��ϴ�.");
		}
	}
	
	
	// �����ϴ� �����̸��� ���� �̸� ������ ����
	// �����ϱ�
	public static void main(String[] args) {
		ImagePR2 ipr = new ImagePR2();
		//ipr.method1();
		
		// ����ȭ�鿡 �̹������� / �����̸�.txt ���� ������� ��
		String ������� = System.getProperty("user.home") + "/Desktop";
						//				�������� �ۼ��� ������ / �� �����ϴ��� Ȯ��
		File �̹������� = new File(������� + "/�̹�������");
		
		// ���࿡ �̹����� �����ϴ��� �������� �ʴ��� Ȯ��
		�̹�������.mkdir(); // �̹������� 1�� ����
		
		// �����̸�.txt���� ���� �� �����̸� �ۼ�
															//, true �̾ �ۼ��ϱ�
		try {
			
			FileWriter �۾��� = new FileWriter(�̹������� + "/�����̸�.txt");
			
			�۾���.write("��\n�����\n����\n�䳢\nȣ����");
			
			
			System.out.println("�����̸� ���Ͽ� �̸��� �ۼ��Ǿ����ϴ�.");
			
			
			�۾���.close(); // �۾��ϰ� �� �Ŀ� �׻� �۾��ϴ� ������ �ݾ��� ��
			// �۾��� �۾��� �Ϸ�Ǿ����ϴ�.
			
			// �����ϴ� �����̸��� ���� �̸� ������ ����
			// �����̸�.txt -> �����ϴµ����̸�.txt ���ϸ� �����ϱ�
			// FileWriter�� �۾��°� �������� ������ �̸��� ���ϰų� �ٸ��۾��� �ϱ� �����
			
			File �������� = new File(�̹������� + "/�����̸�.txt");
			File ���ο��̸� = new File(�̹������� + "/�����ϴµ����̸�.txt");
			if(��������.renameTo(���ο��̸�)) {
				System.out.println("���� �̸��� ���������� ����Ǿ����ϴ�.");
			} else {
				System.out.println("���� �̸� ���濡 �����߽��ϴ�.");
			}
			
			// �����ϱ�
			// ���� ���� ���� ����
			// ���� ������ �� �� ���� �ȿ� ������ �����Ѵٸ� ���� ������ ��������
			
			//���� �ȿ� ������ �����ϴ��� Ȯ���ϰ� ���� �ȿ� ������ �ϳ��� �������� �ʴ´ٸ� ����
			// �迭�� �̿��ؼ� ���ϸ���� �ް� ���ϸ���� ���ٸ� ����
			
			File[] ���ϸ�� = �̹�������.listFiles();
			System.out.println("�����ȿ� ���� ��� ���� : " + ���ϸ��);
			
			// for - each
			for(File f : ���ϸ��) {
				System.out.println(f.getName());
			}
			
			��������.delete();
			���ο��̸�.delete();
			if(�̹�������.delete()) {
				System.out.println("������ ���������� �����Ǿ����ϴ�.");
			} else {
				// ���࿡ ������ �����ְų� ������̸� ������ �ȵ�
				// �����ȿ� ������ ������ �������
				// ���� ���� ����
				System.out.println("���� ������ �����߽��ϴ�.");
			}
			
			
		} catch (IOException e) {
			System.out.println("���� �̸� �ۼ��ϴµ� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
		
	
		
		
		
		
	}
}
