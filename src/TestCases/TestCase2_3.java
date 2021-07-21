package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bl.FindMaximum.Uc2;

class TestCase2_3 {

	@Test
	void test() {
		Float result = Uc2.findMax(1.1f, 2.2f, 3.3f);
		assertEquals(3.3f, result);
	}

}
