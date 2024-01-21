package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator cl = new Calculator();
		int actual = cl.add(5, 90);
		assertEquals(95, actual);
		assertNotEquals(0, actual);
		assertSame(95, actual);
	}

	@Test
	void testSubtract() {
		Calculator cl = new Calculator();
		int actual = cl.subtract(5, 90);
		assertEquals(-85, actual);
	}
	
	@Test
	void testDivide() {
		Calculator cl = new Calculator();
		int actual = cl.divide(90, 5);
		assertEquals(18, actual);
	}
	

}
