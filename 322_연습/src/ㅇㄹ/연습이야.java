package ����;

public class �����̾� {

	public String memberID;
	public String memberPW;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public �����̾�() {
	}
	public �����̾�(String ���̵�, String ���, String �̸�, int ����, char ����, String ����, String ����) {
		this.memberID = ���̵�;
		this.memberPW = ���;
		this.memberName = �̸�;
		this.age = ����;
		this.gender = ����;
		this.phone = ����;
		this.email = ����;
	}
	
	public void ����() {
		System.out.println("����� ���̵� : " + memberID);
		System.out.println("����� ��� : " + memberPW);
		System.out.println("����� �̸� : " + memberName);
		System.out.println("����� ���� : " + age);
	}
	
	public static void main(String[] args) {
		�����̾� pre = new �����̾�("good", "good12", "ȫ�浿", 15, 'M', "010-0000-0000", "didkd@naver.com");
		pre.����();

	}

}
