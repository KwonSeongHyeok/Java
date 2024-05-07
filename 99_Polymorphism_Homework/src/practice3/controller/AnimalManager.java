package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		// ������ 5¥�� Animal Ÿ���� ��ü �迭 ����
		Animal[] animals = new Animal[5];
		// ��������
		Random random = new Random();
		
		for(int i = 0; i < animals.length; i++) {
			// ���࿡ �������� true false�� �������� �� ���� true�� ������
			// random.nextBoolean() : �������� ������ ���� ����
			if(random.nextBoolean()) {
			//	Dog(String name, String kinds, int weight)
			//	�۸��� �̸��� ������ �� �۸���1 �۸���2" "�۸���" + �ڿ����� ����
			//	������ ���� ��     ������ �����Դ� 1 ~ 30kg���� ���� 
				animals[i] = new Dog("�۸���" + (i+1), "��", random.nextInt(30) + 1);
			} else {
				animals[i] = new Cat("�߿���" + (i+1), "�����", "��", "������");
			}		
		}
		//System.out.println(animals[0]);
		for(Animal a : animals) {
			a.speak();
		}
	}
}
