package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

public class AuditionMenu {
	private AuditionController ac = new AuditionController();
	
	public AuditionMenu() {
		
	}
	public void inform() {
		System.out.println("����� ������ �̸� �о� ����");
		System.out.println("==============================");
		
		for(Audition a : ac.printAudition()) {
			System.out.println(a.inform());
		}
		System.out.println("���� : " + ac.sumScore());
		System.out.printf( "��� : %.2f \n", ac.avgScore()[1]);
		System.out.println("�հ� ���� : " + (ac.avgScore()[1] >= ac.CUT_LINE));
		ac.printPass();
	}
	
}
