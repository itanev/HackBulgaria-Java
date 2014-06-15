package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import exercises.CollectionExtensions;

public class reverseTest {

	private CollectionExtensions util;
	
	@Before
	public void setUp() throws Exception {
		util = new CollectionExtensions();
	}

	@Test
	public void testReverseWithRegularCollection() {
		Collection<Integer> testCollection = Arrays.asList(1, 2, 3, 4);
		
		Collection<Integer> newCollection = util.reverse(testCollection);
		
		assertTrue(testCollection != newCollection);
		assertTrue(newCollection.equals(Arrays.asList(4, 3, 2, 1)));
		assertTrue(testCollection.equals(Arrays.asList(1, 2, 3, 4)));
	}
	
	@Test
	public void testReverseWithOneElementCollection() {
		Collection<Integer> testCollection = Arrays.asList(2);
		
		Collection<Integer> newCollection = util.reverse(testCollection);
		
		assertTrue(testCollection != newCollection);
		assertTrue(newCollection.equals(Arrays.asList(2)));
		assertTrue(testCollection.equals(Arrays.asList(2)));
	}
	
	@Test
	public void testReverseWithEmptyCollection() {
		Collection<Integer> testCollection = new ArrayList<>();
		
		Collection<Integer> newCollection = util.reverse(testCollection);
		
		assertTrue(testCollection != newCollection);
	}
}
