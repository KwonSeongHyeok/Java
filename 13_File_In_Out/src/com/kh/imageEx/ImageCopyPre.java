package com.kh.imageEx;

import java.io.*;

public class ImageCopyPre {
	public static void main(String[] args) {
		// �����̹��� hogam �����̹��� hogam_cute
		String �����̹��� = "src/com/kh/imageEx/hogam.jpg";
		String �����̹��� = "src/com/kh/imageEx/hogam_cute.jpg";
		
		// �����̹��� ���� ��������!
		try {
			FileInputStream �����б� = new FileInputStream(�����̹���);
			FileOutputStream ���Ͼ��� = new FileOutputStream(�����̹���);
			
			// ���۸� ���� �����͸� �а� ���� ���� �迭 ����
			byte[] ���� = new byte[1024];
			int ���ϱ���;
			
			// ���۸� ���� ���� �̹��� �����͸� ������ ������ ���Ͽ� ���
			while((���ϱ��� = �����б�.read(����)) > 0) {
				���Ͼ���.write(����, 0, ���ϱ���);
			}
			
			// ���� ��Ʈ�� �ݾ��ֱ�
			�����б�.close();
			���Ͼ���.close();
			
			System.out.println("�̹��� ���簡 �Ϸ�Ǿ����ϴ�.");
			
			
		} catch (Exception e) {
			System.out.println("�̹��� ���� �� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
		
		
	}
}
