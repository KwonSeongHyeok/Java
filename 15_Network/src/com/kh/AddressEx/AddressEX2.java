package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
�ܺ� ������ �ּҸ� �˾ƺ�

�� �� �ּ� �˾ƺ���
InetAddress.getLocalHost() : ���� �� ��ǻ�Ϳ� ������ IP�ּҸ� �������� �޼���

�� IP �ּ� : 192.168.0.19
�⺻���� ó���� ��ǻ�Ͱ� ������ ������ 1���� ���� 192.168.0.1	�������� 1�� �����ϴ�
���ڸ� ������

��������� �Բ� ������ ���, ������ ��ǻ�� ��, ������ ��Ʈ��ũ�� ������ �ް� �� ��쿡��
1���� ��ȣ�� �ο��ް� ��.

	������ 19ȣ
192.168.0.19�� ��� �� �����ִ� ȣ���� �����Ѽ� ���

���ڷ� �츮���ּ� = 127.0.0.1 = localhost = 192.168.0.19

 */
public class AddressEX2 {
	public static void main(String[] args) {
		
		try {
			InetAddress ����ȣ��Ʈ = InetAddress.getLocalHost();
			System.out.println("�� IP �ּ� : " + ����ȣ��Ʈ.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}