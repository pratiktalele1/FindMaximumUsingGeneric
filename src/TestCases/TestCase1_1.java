package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Uc1;

class TestCase1_1 {

	@Test
	void passForFirstTest() {
		int result = Uc1.findMax(8, 5, 7);
		assertEquals(8, result);
	}
}
