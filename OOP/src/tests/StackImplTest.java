package tests;

import static org.junit.Assert.*;
import ex4Stack.*;

import org.junit.Before;
import org.junit.Test;

public class StackImplTest {
	private StackImpl stack;

	@Before
	public void setUp() throws Exception {
		stack = new StackImpl();
	}

	@Test
	public void testInitialization() {
		stack = new StackImpl();
		assertTrue(stack.empty());
	}
	
	@Test
	public void testEmpty() {
		stack = new StackImpl();
		assertTrue(stack.empty());
		
		stack.push(1);
		assertFalse(stack.empty());
	}
	
	@Test
	public void testPush() {
		stack = new StackImpl();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertFalse(stack.empty());
	}
	
	@Test
	public void testPop() {
		stack = new StackImpl();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		int three = stack.pop();
		assertTrue(three == 3);
		stack.pop();
		stack.pop();
		
		assertTrue(stack.empty());
	}
	
	@Test
	public void testPeek() {
		stack = new StackImpl();
		stack.push(1);
		
		int one = stack.peek();
		assertTrue(one == 1);
		assertFalse(stack.empty());
	}
}
