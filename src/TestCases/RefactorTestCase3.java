package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Refactor1;

class RefactorTestCase3 {

	@Test
	void test() {
		Refactor1<String> refactor1=new Refactor1<String>();
		String result=refactor1.findMax("mango","apple","peach");
		assertEquals("peach", result);
	}

}
