package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

public class AuditionMenu {
	private AuditionController ac = new AuditionController();
	
	public AuditionMenu() {
		
	}
	public void inform() {
		System.out.println("오디션 지원자 이름 분야 점수");
		System.out.println("==============================");
		
		for(Audition a : ac.printAudition()) {
			System.out.println(a.inform());
		}
		System.out.println("총점 : " + ac.sumScore());
		System.out.printf( "평균 : %.2f \n", ac.avgScore()[1]);
		System.out.println("합격 유무 : " + (ac.avgScore()[1] >= ac.CUT_LINE));
		ac.printPass();
	}
	
}
