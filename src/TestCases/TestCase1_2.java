package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Uc1;

class TestCase1_2 {

	@Test
	void passForSecondTest() {
		int result = Uc1.findMax(50,80,70);
		assertEquals(80, result);
	}

}
