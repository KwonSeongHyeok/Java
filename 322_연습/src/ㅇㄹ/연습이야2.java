package ����;

public class �����̾�2 {
	public int empNo;
	public String empName;
	public String dept;
	public String job;
	public int age;
	public char gender;
	public int salary;
	public double bonusPoint;
	public String phone;
	public String addres;
	
	public �����̾�2() {
	}
	
	public �����̾�2(int ��ȣ, String �̸�, String ����, String ��å, int ����,
				char ����, int ����, double ���ʽ�����, String ����, String �ּ�) {
		this.empNo = ��ȣ;
		this.empName = �̸�;
		this.dept = ����;
		this.job = ��å;
		this.age = ����;
		this.gender = ����;
		this.salary = ����;
		this.bonusPoint = ���ʽ�����;
		this.phone = ����;
		this.addres = �ּ�;
	}
	
	public void info() {
		System.out.println("��ȣ : " + empNo);
		System.out.println("�̸� : " + empName);
		System.out.println("���� : " + dept);
		System.out.println("��å : " + job);
	}
	
	public static void main(String[] args) {
		�����̾�2 pre = new �����̾�2(100, "ȫ�浿", "������", "����", 25,'��', 2500000, 0.05, "010-1234-5678", "����� ������");
		pre.info();
		
	}
}
	

