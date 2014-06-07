package ex5UniqueStack;

import java.util.ArrayList;

public class UniqueStack implements IUniqueStack {
	private ArrayList<Integer> conn;

	public UniqueStack() {
		this.conn = new ArrayList<Integer>();
	}

	public void push(int el) {
		if(conn.contains(el)) throw new IllegalArgumentException("Duplicate values are not allowed!");
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
