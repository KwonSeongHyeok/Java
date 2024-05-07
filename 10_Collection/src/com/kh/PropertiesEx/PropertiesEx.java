package com.kh.PropertiesEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 Properties = �Ӽ� ���� �־���ϴ� ���� �ۼ�
 	Map�̶� ����� ������ �����͸� �����ϴµ� ���
 	key(Ű) �� value(��)���� �̷���� ����
 	Ű�� ���� ���ڰ� �ƴ϶� ���ڿ��� ���·� ����������
 	
 �޼���
 	setProperty(String key, String value) : ������ Ű�� ������ �ʿ� �׸��� �߰�
 	getProperty(String key) : �־��� Ű�� ���� ���� ��ȯ
 	getProperty(String key, String value) : �־��� Ű�� ���� ���� ����������, �ش� Ű�� ���� ��쿡��
 											�⺻���� ��ȯ
 	load(InputStream in) : �Է� ��Ʈ������ �Ӽ� ����� �о��
 	store(OutputStream out, String comment) : ��� ��Ʈ������ �Ӽ� ����� ����
 	
 Properties�� ��쿡�� ���α׷��̳� �ڵ带 ������ �� �ʼ��� ����������ϴ� ������ �ۼ��� ��
 �ڵ尡 �ƴ϶� ���Ϸ� �ַ� ����
 
 map�� �ַ� �����͸� �ٷ����� properties�� ��� ����Ű�� ȸ�� ������ȣ�� ���������ؼ�
 	������ ���� �ʿ��� ������ �ۼ��س��� ����
 
 * */
public class PropertiesEx {
	public static void main(String[] args) {
		// Properties ��ü ����
		Properties ���� =  new Properties();
		
		
		try {
			// File
			File ��¥���ϸ���� = new File("����.properties");
			// ���࿡ ������ �������� �ʴ´ٸ� ���� ������ֱ�
			if(��¥���ϸ����.exists()) { // �����Ѵٸ�
				System.out.println("������ �����մϴ�.");
			} else {
				System.out.println("���� ������ �����ϴ�. ���ο� ������ �������ּ���");
				��¥���ϸ����.createNewFile();
			}
			
			
			// �������� �����	���࿡ ������� ����.properties �� ���ٸ� ���ο� ������ ������ ��
			FileInputStream ���Ϻҷ����� = new FileInputStream("����.properties");
			����.load(���Ϻҷ�����); // ���ϸ���� ���
			���Ϻҷ�����.close(); // ���ϸ���� ��
			
			// �������̸� ��й�ȣ�� ������ ��
			// ���� �������̸��� �����ں���� ���ٸ� null������ �����Ǿ� ���� ��
			String �������̸� = ����.getProperty("�������̸�");
			String �����ں�� = ����.getProperty("�����ں��");
			
			System.out.println("�������̸� : "+ �������̸�);
			System.out.println("�����ں�� : "+ �����ں��);
			
			// ���� null ������ �ƹ��� ���� ���� ���� �ȴٸ� �������� �������� �� ����
			����.setProperty("name", "�Ŵ���");
			����.setProperty("password", "1234");
			
			// ����� ������ ���Ͽ� ����
			FileOutputStream �������� = new FileOutputStream("����.properties");
			// ���ο� ���� ����� ������ �� � ������ �����ϰų� �����ϰų� �߰��ߴ��� �ۼ�
			����.store(��������, "���� �̸��� ��� ����");
			
			// ���� ���� ����
			��������.close();
			
			System.out.println("�����ڰ� ���������� ����Ǿ����ϴ�.");
			
		} catch(FileNotFoundException e){
			System.out.println("������ �������� �ʽ��ϴ�.");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}