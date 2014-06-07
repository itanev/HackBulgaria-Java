package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ex6DoublyLinkedList.*;

public class DoublyLinkedListTest {
	private DoublyLinkedList dll;
	
	@Before
	public void setUp() throws Exception {
		dll = new DoublyLinkedList();
	}

	@Test
	public void testDLLInit() {
		dll = new DoublyLinkedList();
		
		assertTrue(dll.empty() == true);
		assertTrue(dll.getHead() == null);
		assertTrue(dll.getTail() == null);
		assertTrue(dll.empty() == true);
	}
	
	@Test
	public void testDLLSize() {
		dll = new DoublyLinkedList();
		assertTrue(dll.size() == 0);
		dll.add(1);
		assertTrue(dll.size() == 1);
	}
	
	@Test
	public void testDLLAdd() {
		dll = new DoublyLinkedList();
		dll.add(1);
		
		assertTrue(dll.size() == 1);
		assertTrue(dll.empty() == false);
		assertTrue(dll.getHead().getData() == 1);
		assertTrue(dll.getTail().getData() == 1);
	}
	
	@Test
	public void testRemove() {
		dll = new DoublyLinkedList();
		dll.add(1);
		
		assertTrue(dll.size() == 1);
		dll.remove(1);
		
		assertTrue(dll.empty() == true);
	}
	
	@Test
	public void testEmpty() {
		dll = new DoublyLinkedList();
		assertTrue(dll.empty() == true);
		
		dll.add(1);
		assertTrue(dll.empty() == false);
	}
	
	@Test
	public void testGetHead() {
		dll = new DoublyLinkedList();
		dll.add(1);
		dll.add(2);
		
		assertTrue(dll.getHead().getData() == 2);
	}
	
	@Test
	public void testGetTail() {
		dll = new DoublyLinkedList();
		dll.add(1);
		dll.add(2);
		
		assertTrue(dll.getTail().getData() == 1);
	}
}
