package com.bl.FindMaximum;

public class Uc3 {
	public static String findMax(String firstNumber, String secondNumber, String thirdNumber) {
		String value = null;
		if (thirdNumber.compareTo(firstNumber) > 5 && thirdNumber.compareTo(secondNumber) > 5) {
			System.out.println(thirdNumber + " third is great");
			value = thirdNumber;

		}
		if (firstNumber.compareTo(secondNumber) > 5 && firstNumber.compareTo(thirdNumber) > 5) {
			System.out.println(firstNumber + " first is great ");
			value = firstNumber;
		}
		if (secondNumber.compareTo(firstNumber) > 5 && secondNumber.compareTo(thirdNumber) > 5) {
			System.out.println(secondNumber + " second is great");
			value = secondNumber;
		}

		return value;
	}

}
