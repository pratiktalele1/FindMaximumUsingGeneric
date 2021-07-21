package com.bl.FindMaximum;

import java.util.Arrays;

public class Uc5<E> {
	public  E maxMethod(E... n) {

		Arrays.sort(n);
		testMaximum(n);
		return null;

	}
	
	public void testMaximum(E[] n) {
		int length=n.length;
		System.out.println(n[length-1]);
	}

}
