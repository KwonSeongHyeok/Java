package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/*
 BufferedImage : �̹��� �����͸� �����ϰ� ó���ϴµ� ���
 
 Image : �������̽��� �̹����� ǥ���ϴ� �߻�ȭ�� ������ ����
 
 ImageIO : �̹����� ���Ϸκ��� �а� ����ϴ� �̹��� In Out
 
 
 * */
public class ImageResize {
	public static void main(String[] args) {
		// ���� �̹��� ���
		String �����̹��� = "src/com/kh/imageEx/marley.jpg";
		String �����������̹��� = "src/com/kh/imageEx/marley_cute.jpg";
		
		// �̹��� ���� ���� ũ�� ����
		int ����ũ�� = 200;
		int ����ũ�� = 200;
	
		
		try {
			// �����̹����� ���ؼ� �̹��� �ҷ�����
			BufferedImage �����̹��������� = ImageIO.read(new File(�����̹���));
		
			// ���ο� ũ���� �̹��� ����						���α���  ���α���	�̹��� � Ÿ������ �׷��ٰŴ�
			BufferedImage ũ�������̹��� = new BufferedImage(����ũ��, ����ũ��, BufferedImage.TYPE_INT_RGB);

			// �̹��� ũ�⸦ �����ؼ� ���ο� �̹����� �׸��� ��������
			
			Image �̹����׸��� = �����̹���������.getScaledInstance(����ũ��, ����ũ��, Image.SCALE_SMOOTH);
			
			ũ�������̹���.createGraphics().drawImage(�̹����׸���, 0, 0, null);
			
			// ���� ���� �̹����� ���Ϸ� �����ϱ�!
			ImageIO.write(ũ�������̹���, "jpg", new File(�����������̹���));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}