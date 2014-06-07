package ex4Stack;

import java.util.ArrayList;

public class StackImpl implements IStackImpl {
	private ArrayList<Integer> conn;
	
	public StackImpl() {
		this.conn = new ArrayList<Integer>();
	}
	
	public void push(int el) {
		conn.add(el);
	}
	
	public int pop() {
		int el = conn.get(conn.size() - 1);
		conn.remove(conn.size() - 1);
		return el;
	}
	
	public int peek() {
		return conn.get(conn.size() - 1);
	}
	
	public boolean empty() {
		return conn.size() == 0;
	}
}
