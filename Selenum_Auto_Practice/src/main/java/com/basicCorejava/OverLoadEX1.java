package com.basicCorejava;

public class OverLoadEX1 {

	public void bankDetails(String bankName, String bankAddress) {

		System.out.println(bankName + "" + bankAddress);
	}

	public void bankDetails(int bankPinCode, String bankAddress) {

		System.out.println(bankPinCode + "" + bankAddress);
	}

	public static void main(String[] args) {

		OverLoadEX1 obj = new OverLoadEX1();

		obj.bankDetails("HDFC", "New Delhi");
		obj.bankDetails(500081, "NewDelhi");

	}

}
