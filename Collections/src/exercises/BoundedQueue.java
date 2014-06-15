package exercises;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BoundedQueue<T> implements Queue<T> {
	
	private LinkedList<T> conn;
	private Integer max;
	
	public BoundedQueue(Integer max) {
		conn = new LinkedList<T>();
		this.max = max;
	}
	
	@Override
	public boolean addAll(Collection<? extends T> c) {
		while(conn.size() < max) {
			conn.add(c.iterator().next());
		}
		
		return true;
	}

	@Override
	public void clear() {
		conn.clear();
	}

	@Override
	public boolean contains(Object o) {
		return conn.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return conn.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return conn.isEmpty();
	}

	@Override
	public Iterator<T> iterator() {
		return conn.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return conn.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return conn.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return conn.retainAll(c);
	}

	@Override
	public int size() {
		return conn.size();
	}

	@Override
	public Object[] toArray() {
		return conn.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return conn.toArray(a);
	}

	@Override
	public boolean add(T e) {
		if(conn.size() < max) {
			return conn.add(e);
		}
		
		return false;
	}

	@Override
	public T element() {
		return conn.element();
	}

	@Override
	public boolean offer(T e) {
		if(conn.size() < max) {
			return conn.offer(e);
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String prefix = "";
		
		while(!conn.isEmpty()) {
			result.append(prefix);
			result.append(conn.poll());
			prefix = ",";
		}
		
		return result.toString();
	}

	@Override
	public T peek() {
		return conn.peek();
	}

	@Override
	public T poll() {
		return conn.poll();
	}

	@Override
	public T remove() {
		return conn.remove();
	}
	
}
