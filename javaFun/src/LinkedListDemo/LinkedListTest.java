package LinkedListDemo;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.printValues();
		
		ll.addToBack(4);
		ll.addToBack(42);
		ll.addToBack(19);
		
		ll.printValues();
		
		LLNode n = ll.findNode(42);
		System.out.println(n.getVal());
		System.out.println(n.getNext());
		
		n = ll.findNode(12);
	}
}
