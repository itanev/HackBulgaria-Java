package tests;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.Before;
import org.junit.Test;

import exercises.*;

public class HashMapToHumanReadableStringTest {
	
	private HashMapToHumanReadableString<String, Integer> converter;
	
	@Before
	public void setUp() throws Exception {
		converter = new HashMapToHumanReadableString<>();
	}

	@Test
	public void test() {
		HashMap<String, Integer> map = new LinkedHashMap();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		assertTrue(converter.makeHumanReadable(map).equals("{ one:1, two:2, three:3 }"));
	}

}
