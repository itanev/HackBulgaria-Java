package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercises.OccurencesOfWords;

public class OccurencesOfWordsTest {
	private OccurencesOfWords helper;
	
	@Before
	public void setUp() throws Exception {
		helper = new OccurencesOfWords();
	}

	@Test
	public void test() {
		assertTrue(helper.getMap("Ninjas are all over the place! We are all going to die!").get("are").equals(2));
	}

}
