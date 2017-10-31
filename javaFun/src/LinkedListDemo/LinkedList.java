package LinkedListDemo;

public class LinkedList {
	private LLNode head;
	
	public void addToBack(int val) {
		LLNode newNode = new LLNode(val);
		
		if(head == null) {
			head = newNode;
		} else {
			LLNode runner = head;
			
			while(runner.getNext() != null) {
				runner = runner.getNext();
			}
			
			runner.setNext(newNode);
		}
	}
	
	public void printValues() {
		if(head == null) {
			System.out.println("There are no nodes");
		}
		
		LLNode runner = head;
		
		while(runner != null) {
			System.out.println(runner.getVal());
			runner = runner.getNext();
		}
		
		System.out.println("-----");
	}
	
	public LLNode findNode(int val) {
		LLNode runner = head;
		
		while(runner != null) {
			if(runner.getVal() == val) {
				return runner;
			}
			
			runner = runner.getNext();
		}
		
		throw new IllegalArgumentException("Couldn't find node");
	}

	public LLNode getHead() {
		return head;
	}

	public void setHead(LLNode head) {
		this.head = head;
	}
	
	
}
