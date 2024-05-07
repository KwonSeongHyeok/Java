package com.kh.oop.basic;

public class Animal { // 동물

	// 1. 필드 이름 나이
	public String name;
	public int age;
	
	// 2. 초기 생성자
	public Animal() {
		
	}
	// 3. 필수 생성자 String name, int age
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 4. 출력 메서드 
	public void info(){
		System.out.println("이름 : " + name + "\n"
						 + "나이 : " + age);
		}
	
	// 5. 메인 메서드
	public static void main(String[] args) {
		// 1) 초기생성자로
		Animal dog = new Animal();
		dog.name = "강아지";
		dog.age = 5;
		dog.info();
		
		//	2) 필수생성자로
		Animal cat = new Animal("고양이" , 3);
		cat.info();
	}
	
}
