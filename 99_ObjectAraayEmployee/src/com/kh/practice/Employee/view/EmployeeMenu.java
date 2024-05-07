package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	private EmployeeController ssm = new EmployeeController();
	
	public EmployeeMenu() {
		
	}
	
	public void printEmployeeMenu() {
		System.out.println("���� �̸� ���� ����");
		System.out.println("==============");
		
		for(Employee employee : ssm.printEmployee()) {
			System.out.println(employee.inform());
		}
		System.out.println("���� : " + ssm.sumScore());
		System.out.println("��� : " + ssm.avgScore()[1]);
		System.out.println("�հ� ���� : " + (ssm.avgScore()[1] >= ssm.CUT_LINE));
	}


}
