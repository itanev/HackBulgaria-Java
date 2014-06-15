package tests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import exercises.CollectionExtensions;

public class monotonicTest {
	
	private CollectionExtensions util;
	
	@Before
	public void setUp() throws Exception {
		util = new CollectionExtensions();
	}
	@Test
	public void testRegularSequence() {
		
		assertTrue(util.isMonotonic(Arrays.asList(1,2,3,4,5,6)));
		assertTrue(util.isMonotonic(Arrays.asList(6,5,4,3,2,1,1,1)));
		assertFalse(util.isMonotonic(Arrays.asList(1,2,1,4,5,4)));
	}

	@Test
	public void testWithOneElementSequence() {
		
		assertTrue(util.isMonotonic(Arrays.asList(1)));
	}
	
	@Test
	public void testWithEmptySequence() {
		ArrayList<Integer> emptyList = new ArrayList<>();
		assertTrue(util.isMonotonic(emptyList));
	}
}
