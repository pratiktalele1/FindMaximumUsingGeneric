package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Refactor1;

class RefactorTestCase {

	@Test
	void test() {
		Refactor1<Integer> refactor1=new Refactor1<Integer>();
		int result=refactor1.findMax(1, 2, 3);
		assertEquals(3, result);
	}

}
