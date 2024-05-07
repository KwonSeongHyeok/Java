package ㅇㄹ;

public class 연습이야 {

	public String memberID;
	public String memberPW;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public 연습이야() {
	}
	public 연습이야(String 아이디, String 비번, String 이름, int 나이, char 성별, String 폰번, String 메일) {
		this.memberID = 아이디;
		this.memberPW = 비번;
		this.memberName = 이름;
		this.age = 나이;
		this.gender = 성별;
		this.phone = 폰번;
		this.email = 메일;
	}
	
	public void 상태() {
		System.out.println("멤버의 아이디 : " + memberID);
		System.out.println("멤버의 비번 : " + memberPW);
		System.out.println("멤버의 이름 : " + memberName);
		System.out.println("멤버의 나이 : " + age);
	}
	
	public static void main(String[] args) {
		연습이야 pre = new 연습이야("good", "good12", "홍길동", 15, 'M', "010-0000-0000", "didkd@naver.com");
		pre.상태();

	}

}
