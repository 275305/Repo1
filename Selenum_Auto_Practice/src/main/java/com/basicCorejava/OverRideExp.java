package com.basicCorejava;

class Employee{
	
	public void getEmpName(){
		System.out.println(" parent  class");
	}
}



public class OverRideExp extends Employee{
	
	public void getEmpName(){
		System.out.println(" child class");
	}
	public static void main(String[] args) {
		   Employee emp=new OverRideExp();
		   emp.getEmpName();
		    new Employee().getEmpName();;
		   
		   
	}

}
