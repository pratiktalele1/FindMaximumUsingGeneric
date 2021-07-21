package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Uc3;

class TestCase3_3 {

	@Test
	void test() {
		String result=Uc3.findMax("Apple", "Banana", "mango");
		assertEquals("mango", result);	}

}
