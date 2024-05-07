package com.kh.oop.method;

public class Animal {
	// 필드
	public String name;
	public int age;
	
	
	// 메서드
		// 생성자
	public Animal() {
		
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// return 메서드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void info() {
		System.out.println("동물 이름 : " + name);
		System.out.println("동물 나이 : " + age);
	}
	
	
	// 메인메서드
	public static void main(String[] args) {
		/*Animal dog = new Animal("강아지", 1);
		
		System.out.println("강아지 이름 : " + dog.getName());
		System.out.println("강아지 나이 : " + dog.getAge());

		Animal cat = new Animal("고양이", 1);
		
		System.out.println("고양이 이름 : " + cat.getName());
		System.out.println("고양이 나이 : " + cat.getAge());
		*/
		Animal dog = new Animal("강아지", 1);
		dog.info();
		
		Animal cat = new Animal("고양이", 1);
		cat.info();
	}

}
