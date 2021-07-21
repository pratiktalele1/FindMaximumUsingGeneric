package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Refactor1;

class RefactorTestCase2 {

	@Test
	void test() {
		Refactor1<Float> refactor1=new Refactor1<Float>();
		float result=refactor1.findMax(1.1f, 2.2f, 3.3f);
		assertEquals(3.3f, result);
	}

}
