package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ex7StackWithLL.*;

public class StackLLTest {
	private IStackWithLL stack;
	
	@Test
	public void testInit() {
		stack = new StackWithLL();
		
		assertTrue(stack.empty() == true);
	}
	
	@Test 
	public void testPush() {
		stack = new StackWithLL();
		assertTrue(stack.empty() == true);
		
		stack.push(1);
		assertTrue(stack.empty() == false);
		
	}
	
	@Test
	public void testPeek() {
		stack = new StackWithLL();
		assertTrue(stack.empty() == true);
		
		stack.push(1);
		assertTrue(stack.peek() == 1);
		
		stack.push(2);
		assertTrue(stack.peek() == 2);
	}
	
	@Test
	public void testPop() {
		stack = new StackWithLL();
		assertTrue(stack.empty() == true);
		
		stack.push(1);
		assertTrue(stack.peek() == 1);
		
		stack.push(2);
		assertTrue(stack.peek() == 2);
		
		assertTrue(stack.pop() == 2);
		
		stack.pop();
		assertTrue(stack.empty() == true);
	}

}
