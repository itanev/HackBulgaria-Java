package tests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import exercises.FirstUniqueElement;

public class FirstUniqueElementTest {
	private FirstUniqueElement helper;
	
	@Before
	public void setUp() throws Exception {
		helper = new FirstUniqueElement();
	}

	@Test
	public void test() {
		assertTrue(helper.getUniqueElement(Arrays.asList(1,2,3,4,5,5,4,3,1)).equals(2));
	}

}
