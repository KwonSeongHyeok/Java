package com.kh.abstractEx;

// ���� �������� extends
public class �簢�� extends ����{
// �ʵ�
	private double �غ�;
	private double ����;
	
	// ������
	public �簢��(String ����, double �غ�, double ����) {
		super(����);
		this.�غ� = �غ�;
		this.���� = ����;
	}

	@Override
	public double ��������() {
		return �غ� * ����;
	}
	
	@Override
	public double �����ѷ�() {
		return (�غ� * 2) + (���� * 2);
	}
}
