package ex6DoublyLinkedList;

public class DoublyLinkedList implements IDoublyLinkedList
{
    protected Node head;
    protected Node tail;
    public int size;
 
    public DoublyLinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }
    
    public boolean empty()
    {
        return size == 0;
    }
    
    public int size()
    {
        return size;
    }
    
    public void add(int val)
    {
        Node nptr = new Node(val, null, null);    
        if (head == null)
        {            
            nptr.setLinkNext(nptr);
            nptr.setLinkPrev(nptr);
            head = nptr;
            tail = head;            
        }
        else
        {
            nptr.setLinkPrev(tail);
            tail.setLinkNext(nptr);
            head.setLinkPrev(nptr);
            nptr.setLinkNext(head);
            head = nptr;        
        }
        
        size++ ;
    }
    
    public void remove(int pos)
    {        
        if (pos == 1) 
        {
            if (size == 1)
            {
                head = null;
                tail = null;
                size = 0;
                return; 
            }
            
            head = head.getLinkNext();
            head.setLinkPrev(tail);
            tail.setLinkNext(head);
            size--; 
            return;
        }
        
        if (pos == size)
        {
            tail = tail.getLinkPrev();
            tail.setLinkNext(head);
            head.setLinkPrev(tail);
            size-- ;
        }
        
        Node ptr = head.getLinkNext();
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Node p = ptr.getLinkPrev();
                Node n = ptr.getLinkNext();
 
                p.setLinkNext(n);
                n.setLinkPrev(p);
                size-- ;
                return;
            }
            
            ptr = ptr.getLinkNext();
        }        
    }   
    
    public Node get(int pos) {
    	Node result = head;
    	for(int i = 0; i < pos; i++) {
    		result = result.getLinkNext();
    	}
    	
    	return result;
    }
    
    public Node getHead() {
    	return head;
    }
    
    public Node getTail() {
    	return tail;
    }
}