package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ex4Stack.StackImpl;
import ex5UniqueStack.UniqueStack;

public class UniqueStackTest {
	private UniqueStack stack;

	@Before
	public void setUp() throws Exception {
		stack = new UniqueStack();
	}

	@Test
	public void testInitialization() {
		stack = new UniqueStack();
		assertTrue(stack.empty());
	}
	
	@Test
	public void testEmpty() {
		stack = new UniqueStack();
		assertTrue(stack.empty());
		
		stack.push(1);
		assertFalse(stack.empty());
	}
	
	@Test
	public void testPush() {
		stack = new UniqueStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertFalse(stack.empty());
	}
	
	@Test
	public void testPop() {
		stack = new UniqueStack();
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
		stack = new UniqueStack();
		stack.push(1);
		
		int one = stack.peek();
		assertTrue(one == 1);
		assertFalse(stack.empty());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDuplication() {
		stack = new UniqueStack();
		stack.push(1);
		stack.push(1);
	}
}
