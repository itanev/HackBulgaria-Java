package ex7StackWithLL;

import ex6DoublyLinkedList.*;

public class StackWithLL implements IStackWithLL {
	
	private IDoublyLinkedList ll;
	
	public StackWithLL() {
		ll = new DoublyLinkedList();
	}
	
	@Override
	public void push(int el) {
		ll.add(el);
	}

	@Override
	public int pop() {
		int result = ll.get(ll.size()).getData();
		ll.remove(ll.size());
		
		return result;
	}

	@Override
	public int peek() {
		int result = ll.get(ll.size()).getData();
		
		return result;
	}

	@Override
	public boolean empty() {
		return ll.empty();
	}

}
