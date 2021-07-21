package com.bl.FindMaximum;

public class FindMaximumMain {
	public static void main(String[] args) {
		Integer integer = 5;
		Integer integer2 = 80;
		Integer integer3 = 74;

		Uc1 uc1 = new Uc1();
		uc1.findMax(integer, integer2, integer3);

		Float float1 = 1.1f;
		Float float2 = 2.2f;
		Float float3 = 3.3f;

		Uc2 uc2 = new Uc2();
		uc2.findMax(float1, float2, float3);

		String string = "Apple";
		String string2 = "mango";
		String string3 = "Banana";
		
		Uc3 uc3 =new Uc3();
		uc3.findMax(string, string2, string3);

	}
}
