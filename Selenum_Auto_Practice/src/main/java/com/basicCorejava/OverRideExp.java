package com.basicCorejava;

class Employee {

	public void getEmpName(String empName, String empAddress) {
		System.out.println(empName + " " + empAddress);
	}
}

public class OverRideExp extends Employee {

	public void getEmpName(String empName, String empAddress) {
		System.out.println(empName+" "+empAddress);
	}

	public static void main(String[] args) {
		Employee emp = new OverRideExp();
		emp.getEmpName("Scot","England");
		OverRideExp obj=new OverRideExp();
		obj.getEmpName("Jhon","USA");
		

	}

}
