package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ex1Cars.*;

public class CarsTest {

	private Car car;
	
	@Before
	public void setUp() throws Exception {
		car = new Car();
	}

	@Test
	public void testCarToString() {
		assertTrue(car.toString() == "Just a car");
	}
	
	@Test
	public void testAudiToString() {
		car = new Audi();
		assertTrue(car.toString() == "Audi");
	}
	
	@Test
	public void testBMWToString() {
		car = new BMW();
		assertTrue(car.toString() == "BMW");
	}
	
	@Test
	public void testWolkswagenToString() {
		car = new Wolkswagen();
		assertTrue(car.toString() == "Wolkswagen");
	}

}
