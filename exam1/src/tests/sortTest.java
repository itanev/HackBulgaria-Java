package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import exercises.CollectionExtensions;

public class sortTest {
	
	@Test
	public void testSortWithRegularCollection() {
		Collection<Integer> testCollection = Arrays.asList(2, 3, 1, 4);
		
		Collection<Integer> newCollection = CollectionExtensions.sort(testCollection);
		
		assertNotSame(testCollection, newCollection);
		assertTrue(newCollection.equals(Arrays.asList(1, 2, 3, 4)));
		assertTrue(testCollection.equals(Arrays.asList(2, 3, 1, 4)));
	}
	
	@Test
	public void testSortWithOneElementCollection() {
		Collection<Integer> testCollection = Arrays.asList(2);
		
		Collection<Integer> newCollection = CollectionExtensions.sort(testCollection);
		
		assertNotSame(testCollection, newCollection);
		assertTrue(newCollection.equals(Arrays.asList(2)));
		assertTrue(testCollection.equals(Arrays.asList(2)));
	}
	
	@Test
	public void testSortWithEmptyCollection() {
		Collection<Integer> testCollection = new ArrayList<>();
		
		Collection<Integer> newCollection = CollectionExtensions.sort(testCollection);
		
		assertNotSame(testCollection, newCollection);
	}
}
