package com.kh.interfaceEx;

// ���� �⺻ ��� �޼��� implements�� ��������
// ���� 220v ����ؼ� ����� ��
	// �������̽� ��� ~~~~~~ �������̽��� ������� ������ ������ ������ �� �� ����
	// ���� ������ ������ �� �� , �Ἥ interface ���ϸ��� �ۼ����ָ� ��
public class ��̿���� implements ����, ���{
    /*	  ���.java ���ͷ��̽����� ������ �����ѱ�� ��������	*/
	@Override
	public void �����ѱ�() {
		System.out.println("������ ŵ�ϴ�.");
	}
	@Override
	public void ��������() {
		System.out.println("������ ���ϴ�.");
	}
    /*	  ����.java ���ͷ��̽����� ������ �� �� �� �� ������	*/
	@Override
	public int ��(int a, int b) {
		return a + b;
	}
	@Override
	public int ��(int a, int b) {
		return a - b;
	}
	@Override
	public int ��(int a, int b) {
		return a * b;
	}
	@Override
	public double ��(int a, int b) {
		return a / b;
	}
	@Override
	public int ������(int a, int b) {
		return a % b;
	}
}
