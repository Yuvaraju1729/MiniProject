package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		MiniProject m = new MiniProject();
		int output=m.square(5);
		assertEquals(25,output);
	}

}
