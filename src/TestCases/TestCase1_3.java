package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Uc1;

class TestCase1_3 {

	@Test
	void passForThirdTest() {
		int result = Uc1.findMax(500, 700, 800);
		assertEquals(800, result);
	}

}
