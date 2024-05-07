package com.kh.SocketEX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
java.net.BindException: Address already in use: bind
	at java.base/sun.nio.ch.Net.bind0(Native Method)
	at java.base/sun.nio.ch.Net.bind(Net.java:555)
	at java.base/sun.nio.ch.Net.bind(Net.java:544)
	at java.base/sun.nio.ch.NioSocketImpl.bind(NioSocketImpl.java:643)
	at java.base/java.net.ServerSocket.bind(ServerSocket.java:388)
	at java.base/java.net.ServerSocket.<init>(ServerSocket.java:274)
	at java.base/java.net.ServerSocket.<init>(ServerSocket.java:167)
	at com.kh.SocketEX.ServerEx.main(ServerEx.java:14)

ServerSocket ������ = new ServerSocket(12349);
�Ұ�ȣ �ȿ� ����ִ� ��Ʈ��ȣ�� ����ϰ� �ֱ� ������ ���� ������
�Ұ�ȣ �ȿ� �ִ� ��ȣ�� �ٲ��ָ� ��

 * */

// ��ȭ �����ϴ� ��ȭ ��ü��
public class ServerEx {
	public static void main(String[] args) {
		// ��ȭ ��ü�ڴ� ���� �� �ּҿ� �츮���� ��� ������ ������ ���(��Ʈ��ȣ) ����
		
		// ���� ���� ��Ʈ ��ȣ�� �����ؼ� ServerSocket ����
		
		try {
			ServerSocket s = new ServerSocket(12350);
			
			//System.out.println("���ְ� �� ��ȣ�� ���Ƚ��ϴ�.");
			System.out.println("party chat open");
			
			//�츮���� �湮�ϴ� �մ��� ������ ����
			
			Socket b = s.accept();
			System.out.println("client success"); // �� �� �������� Ȯ��
			
			 
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			
			// �����ڷκ��� ���� �޼��� ���� �� ���
			String m; // = in.readLine();
			
			while((m = in.readLine()) != null) { 
				System.out.println("send success : " + m);
				
				out.println("cccccc hhhhhh eeeee cccc kkk");
				//out.println("hihihi");
			}
			
			b.close();
			s.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
