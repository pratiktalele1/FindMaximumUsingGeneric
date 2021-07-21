package com.bl.FindMaximum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Uc4<E> {

	public <E extends Comparable<E>> E maxMethod(E... n) {

		Arrays.sort(n);
		for (E e : n) {
			System.out.print(e+" ");
		}
		System.out.println("");
		return null;

	}

}
