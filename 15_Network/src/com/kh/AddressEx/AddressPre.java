package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	// www.google.com ȣ��Ʈ��� Ip�ּ� ��������
	
	public static void main(String[] args) {
		try {
			
			InetAddress ���� = InetAddress.getByName("www.google.com");
			System.out.println("ȣ��Ʈ�� : " + ����.getHostName());
			System.out.println("IP �ּ� : " + ����.getHostAddress());
	
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		// ���� ��ǻ�� �̸��� �ڸ���ȣ Ȯ���ϱ�
		// get loclahost
		
		try {
			InetAddress ����ȣ��Ʈ = InetAddress.getLocalHost();
			System.out.println("�����ּ� : " + ����ȣ��Ʈ);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// www.facebook.com ���̽��� ȣ��Ʈ�̸� ȣ��Ʈ�ּ�
		 try {
			InetAddress ���̽��� = InetAddress.getByName("www.facebook.com");
			System.out.println(���̽���);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		// www.instagram.com �ν�Ÿ�׷� ȣ��Ʈ�̸� ȣ��Ʈ�ּ� �˻�
		try {
			InetAddress �ν�Ÿ = InetAddress.getByName("www.instagram.com");
			System.out.println(�ν�Ÿ);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
