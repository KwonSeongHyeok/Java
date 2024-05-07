package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	private EmployeeController ssm = new EmployeeController();
	
	public EmployeeMenu() {
		
	}
	
	public void printEmployeeMenu() {
		System.out.println("직원 이름 과목 성적");
		System.out.println("==============");
		
		for(Employee employee : ssm.printEmployee()) {
			System.out.println(employee.inform());
		}
		System.out.println("총점 : " + ssm.sumScore());
		System.out.println("평균 : " + ssm.avgScore()[1]);
		System.out.println("합격 여부 : " + (ssm.avgScore()[1] >= ssm.CUT_LINE));
	}


}
