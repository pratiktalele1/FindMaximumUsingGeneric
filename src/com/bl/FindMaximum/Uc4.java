package com.bl.FindMaximum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Uc4<E> {

	public <E extends Comparable<E>> E testMaximum(E... n) {

		Arrays.sort(n);
		int length=n.length;
		System.out.println(n[length-1]);
		return null;

	}

}
