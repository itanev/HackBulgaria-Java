package ex6DoublyLinkedList;

public interface IDoublyLinkedList {
	public void add(int el);
	public void remove(int pos);
	public int size();
	public Node get(int pos);
	public Node getHead();
	public Node getTail();
	public boolean empty();
}
