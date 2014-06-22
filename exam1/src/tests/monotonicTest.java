package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import exercises.CollectionExtensions;

public class monotonicTest {
	
	@Test
	public void testRegularSequence() {
		
		assertTrue(CollectionExtensions.isMonotonic(Arrays.asList(1,2,3,4,5,6)));
		assertTrue(CollectionExtensions.isMonotonic(Arrays.asList(6,5,4,3,2,1,1,1)));
		assertFalse(CollectionExtensions.isMonotonic(Arrays.asList(1,2,1,4,5,4)));
	}

	@Test
	public void testWithOneElementSequence() {
		
		assertTrue(CollectionExtensions.isMonotonic(Arrays.asList(1)));
	}
	
	@Test
	public void testWithEmptySequence() {
		ArrayList<Integer> emptyList = new ArrayList<>();
		assertTrue(CollectionExtensions.isMonotonic(emptyList));
	}
}
