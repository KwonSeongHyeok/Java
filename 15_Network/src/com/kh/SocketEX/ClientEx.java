package com.kh.SocketEX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// ��Ƽ������
public class ClientEx {
	public static void main(String[] args) {
		
		
		
		try {
			//				localhost = 127.0.0.1�� ����ǻ���ּҶ�� �ǹ�
			
			//						  �����ϰ��� �ϴ� ��ǻ�� �ּ�  ������ ��Ʈ��ȣ
			Socket c = new Socket("localhost"			, 12350);

			// �����ڿ� ��ȭ�� �ϱ� ���� ����� ��Ʈ�� ����
			// 1.	������.getInputStream() : �����ڰ� �ۼ��� �����͸� �о���� ���� �Է� ��Ʈ���� ������(���ڰ����� ��ȭ�� ������)
			// 2.	InputStreamReader : �ϳ����� �ܾ���� ���ڿ��� ���ڷ� ��ȯ�ϴµ� ���
			// 3.	BufferedReader : �ϳ��� �� �����͸� �� ���� �������� ���� �� �ֵ��� ������
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			// �ۼ��� ������ ������ �� �� �ְ� �������� ������ �ϰ�, ������ ���� �� �ְ� ������
			// 1.	������.getOutputStream(), true : �����ڰ� �ۼ��� ������ �������� ���� ������
			//										true�� ��������ν� �������� ok ��� �ǹ�
			// 2.	PrintWriter : �ؽ�Ʈ�� ����ϴµ� ������ ���� �Ų����� ����� �� �ֵ��� ������
			//					  flush() : ������ ����Ҵ� ���� <- true ���ԵǾ�����
			PrintWriter out = new PrintWriter(c.getOutputStream(), true);
			
			
			// �����ڷ� �޼��� ����
			out.println(" hi server !");
			
			// �����ڷκ��� ���� �޼��� ���� �� ���
			String m = in.readLine();
			System.out.println("send success : " + m);

			// for�� while �� ����ؼ� ����� Ȯ��
			// Ŭ���̾�Ʈ�� ������ ���� �� ���� ������ �޼����� �ٽ� ������ ����غ�������
			for(int i = 0; i <3; i++) {
				out.print(i);
				String t = in.readLine();
				System.out.println("send success : " + t);
			}
			
			
			/*while((m = in.readLine()) != null) { 
				System.out.println("send success : " + m);
				
			}*/
			
			
			
			// �ݱ� �� �Ҹ��� ���� �������� ������ ������ ������ ������ �ݱ�
			in.close();
			out.close();
			c.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}