package com.kh.Inheritance.OverrideEx;

public class ����� extends ����{
//�޼���
	// ������ : �ʼ�
	public �����(String �̸�) {
		super(�̸�);
	}
	
	// ������ �Ҹ��� ������ �ͼ� ����� �Ҹ��� ����
	@Override
	public void �Ҹ�() {
		System.out.println(�̸� + "��(��) �߿� �Ҹ��� ���ϴ�.");
	}
}
