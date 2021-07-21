package com.bl.FindMaximum;

public class FindMaximumMain {
	public static void main(String[] args) {
		Integer integer = 5;
		Integer integer2 = 80;
		Integer integer3 = 74;

		// creating object for integer type
		Uc1 uc1 = new Uc1();
		uc1.findMax(integer, integer2, integer3);

		Float float1 = 1.1f;
		Float float2 = 2.2f;
		Float float3 = 3.3f;
		// creating object for float type
		Uc2 uc2 = new Uc2();
		uc2.findMax(float1, float2, float3);

		String string = "Apple";
		String string2 = "mango";
		String string3 = "Banana";

		// creating object for string type
		Uc3 uc3 = new Uc3();
		uc3.findMax(string, string2, string3);

		// generating generic method object
		Refactor1 refactor1 = new Refactor1<Integer>();
		refactor1.findMax(integer, integer2, integer3);

		Refactor1 refactor2 = new Refactor1<Integer>();
		refactor2.findMax(float1, float2, float3);

		Refactor1 refactor3 = new Refactor1<Integer>();
		refactor3.findMax(string, string2, string3);

		// generting generic class object
		Refactor2<Integer> refactor22 = new Refactor2<Integer>(1, 2, 3);
		refactor22.findMax(1, 2, 3);

		Refactor2<Float> refactor23 = new Refactor2<Float>(1.1f, 2.2f, 3.3f);
		refactor23.findMax(1.1f, 2.2f, 3.3f);

		Refactor2<String> refactor24 = new Refactor2<String>("apple", "mango", "peach");
		refactor24.findMax("apple", "mango", "peach");

		//max method with unlimited oprands
		Uc4<Integer> uc4 = new Uc4<Integer>();
		uc4.testMaximum(100,90,80,75,26,14,32,78);
		uc4.testMaximum(1.1f,12.5f,63.56f,4.2f,45.5f);
		
		//generic print method
		Uc5<Integer> uc5=new Uc5<Integer>();
		uc5.maxMethod(100,90,80,75,26,14,32,78);
	}
}
