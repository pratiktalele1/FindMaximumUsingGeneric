package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Uc2;

class TestCase2_1 {

	@Test
	void test() {
		Float result = Uc2.findMax(3.3f, 2.2f, 1.1f);
		assertEquals(3.3f, result);
	}

}
