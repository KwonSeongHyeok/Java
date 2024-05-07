package ㅇㄹ;

public class 연습이야2 {
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
	
	public 연습이야2() {
	}
	
	public 연습이야2(int 번호, String 이름, String 직무, String 직책, int 나이,
				char 성별, int 월급, double 보너스점수, String 폰번, String 주소) {
		this.empNo = 번호;
		this.empName = 이름;
		this.dept = 직무;
		this.job = 직책;
		this.age = 나이;
		this.gender = 성별;
		this.salary = 월급;
		this.bonusPoint = 보너스점수;
		this.phone = 폰번;
		this.addres = 주소;
	}
	
	public void info() {
		System.out.println("번호 : " + empNo);
		System.out.println("이름 : " + empName);
		System.out.println("직무 : " + dept);
		System.out.println("직책 : " + job);
	}
	
	public static void main(String[] args) {
		연습이야2 pre = new 연습이야2(100, "홍길동", "영업부", "과장", 25,'남', 2500000, 0.05, "010-1234-5678", "서울시 강남구");
		pre.info();
		
	}
}
	

