package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	
	public static void main(String[] args) {
		// �����̹��� pigs.jpg pigs_cute.jpg	���� = 400	���� = 200
		String �����̹��� = "src/com/kh/imageEx/pigs.jpg";
		String �����������̹��� = "src/com/kh/imageEx/pigs_cute.jpg";
		
		// �̹��� ���μ��� ũ�� ����
		int ���� = 400;
		int ���� = 200;
		
		try {
			// ���� �̹��� �����͸� �����̹����� �о����
			BufferedImage �����̹��������� = ImageIO.read(new File(�����̹���));
			
			// ���ο� ũ�� �̹��� ����
			BufferedImage �̹������� = new BufferedImage(����, ����, BufferedImage.TYPE_INT_RGB);
			
			// �̹���ũ�⸦ �����ؼ� ���ο� �̹����� �׸� ��!
			Image �̹����׸��� = �����̹���������.getScaledInstance(����, ����, Image.SCALE_SMOOTH);
		
			// ��� �غ� �Ϸ� �̹��� �׸��� ����					x	y	ȿ���߰�����
			�̹�������.createGraphics().drawImage(�̹����׸���, 0, 0, null);
		
			// ���θ��� �̹����� ���Ϸ� �����ϱ�
			ImageIO.write(�̹�������, "jpg", new File(�����������̹���));
		
			System.out.println("�̹��� ũ�� ���� ����!");
		
		} catch (IOException e) {
			System.out.println("�̹��� ���忡 �����߽��ϴ�.");
			e.printStackTrace();
		}
	}
}
