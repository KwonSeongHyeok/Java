package com.kh.oop.constructor;
//1. ȸ������
public class Join {
	// �ʵ� ȸ����ȣ ���̵� �̸� ����ó
	public int memberNo; 	// ȸ�������� ����
	public String memberId; // ȸ���� �ۼ��� ���̵� nickName
	public String memberName;
	public String phoneNumber;
	
	// ������ �⺻ �ʼ�
	public Join() { // �ʼ� x
		
	}
	
	public Join(int memberNo, String memberId, String memberName, String phoneNumber) {
	//	�̰��� �ʵ忡 �ִ� memberNo�� = ���߿� �ۼ��� memberNom�� �ְڽ��ϴ�.
				  this.memberNo = memberNo;
				  this.memberId = memberId;
				  this.memberName = memberName;
				  this.phoneNumber = phoneNumber;
	}
	
	// �޼��� = Ŭ���� �ȿ� �����ϰ�, Ư�� ����� �� �� �ֵ��� ������� �ڵ� ����
		// void �޼��� : ����� �������� ����
	public void memberInfo() {
		System.out.println("��� ��ȣ : " + memberNo);
		System.out.println("��� I D : " + memberId);
		System.out.println("��� �̸� : " + memberName);
		System.out.println("��� ���� : " + phoneNumber);
		System.out.println("-----------------------");
	}
	
	// �������� �������ִ� ���� �޼���
	public static void main(String[] args) {
		System.out.println("=== kh ���� ȸ�� ���� Ȯ�� ===");
		
		// ȸ��1�� ���� ����Ȯ��
		// ȸ������(=Join) ��ü ����
		Join member1 = new Join();
		
		// �ʼ��� ����
		member1.memberId = "������";
		member1.memberName = "���۶��";
		member1.phoneNumber = "010-1111-2222";
		member1.memberInfo();
	
		// �ʼ��� ����
		Join member2 = new Join();
		member2.memberId = "�л��޸�";
		member2.memberName = "ȫ�浿";
		member2.memberInfo();
		
		// ȸ�������� �� �ʼ��� �ۼ��ؾ��ϴ� �ʼ� �ۼ��� ����
		// ȸ����ȣ ���̵� �̸� �ڵ�����ȣ
		Join member3 = new Join(3, "�Ŀ�����", "�ڿ���", "010-1111-2222");
		member3.memberInfo();
		
		Join member4 = new Join();
		member4.memberNo = 4;
		member4.memberId = "���ƴ�";
		member4.memberInfo();
		
		Join member5 = new Join(5, "���۸�", "�� ����", "010-1938-1932");
		member5.memberInfo();
		
	}

}
