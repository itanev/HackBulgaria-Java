package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ex3Pairs.*;

public class PairsTest {
	private Pair pair;
	
	@Before
	public void setUp() throws Exception {
		pair = new Pair(1, 2);
	}

	@Test
	public void testGetter() {
		assertTrue(pair.getFirst() == 1);
		assertTrue(pair.getSecond() == 2);
	}
	
	@Test
	public void testSetter() {
		pair.setFirst(2);
		assertTrue(pair.getFirst() == 2);
		pair.setSecond(1);
		assertTrue(pair.getSecond() == 1);
	}
	
	@Test
	public void testToString() {
		pair = new Pair(1, 2);
		
		assertTrue(pair.toString().equals("(1, 2)"));
	}
	
	@Test
	public void testEquals() {
		Pair first = new Pair(1, 2);
		Pair second = new Pair(1, 2);
		
		assertTrue(first.equals(second));
	}

}
