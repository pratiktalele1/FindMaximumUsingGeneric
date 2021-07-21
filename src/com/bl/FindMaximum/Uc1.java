package com.bl.FindMaximum;

public class Uc1 {
	
	public static Integer findMax(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer value = null;
		if (thirdNumber.compareTo(firstNumber)>0 && thirdNumber.compareTo(secondNumber)>0) {
			System.out.println(thirdNumber+" third is great");
			value=thirdNumber;
			
		}
		if (firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
			System.out.println(firstNumber+" first is great ");
			value=firstNumber;
		}
		if (secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
			System.out.println(secondNumber+" second is great");
			value=secondNumber;
		}
		return value;
	}
}
