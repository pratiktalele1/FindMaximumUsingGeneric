package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Refactor1;

class GenericTestCase {

	@Test
	void test() {
		Refactor2<Integer> refactor2=new Refactor2<Integer>();
		Integer result=refactor2.findMax("mango","apple","peach");
		assertEquals("peach", result);
	}

}
