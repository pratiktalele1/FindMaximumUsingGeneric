package com.bl.FindMaximum;

public class FindMaximumMain {
	public static void main(String[] args) {
		Integer integer = 5;
		Integer integer2 = 80;
		Integer integer3 = 74;
		
		//creating object for integer type
//		Uc1 uc1 = new Uc1();
//		uc1.findMax(integer, integer2, integer3);

		Float float1 = 1.1f;
		Float float2 = 2.2f;
		Float float3 = 3.3f;
		//creating object for float type
//		Uc2 uc2 = new Uc2();
//		uc2.findMax(float1, float2, float3);

		String string = "Apple";
		String string2 = "mango";
		String string3 = "Banana";
		
		//creating object for string type
//		Uc3 uc3 =new Uc3();
//		uc3.findMax(string, string2, string3);
		
		Refactor1 refactor1=new Refactor1<Integer>();
		refactor1.findMax(integer, integer2, integer3);
		
		Refactor1 refactor2=new Refactor1<Integer>();
		refactor2.findMax(float1, float2, float3);
		
		Refactor1 refactor3=new Refactor1<Integer>();
		refactor3.findMax(string, string2, string3);
	}
}
