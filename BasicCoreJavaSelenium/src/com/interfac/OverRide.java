package com.interfac;

public class OverRide {

	public void sum(int a, int b) {
		System.out.println("parent class");
	}

	public static void main(String[] args) {
             OverRide r=new TestClass();
             r.sum(1, 2);
	}
}
class TestClass extends OverRide {

	public void sum(int a, int b) {
		System.out.println("child");
	}

}