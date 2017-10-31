package LinkedListDemo;

public class LLNode {
	private int val;
	private LLNode next;

	public LLNode(int val) {
		this.val = val;
		this.next = null;
	}
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public LLNode getNext() {
		return next;
	}

	public void setNext(LLNode next) {
		this.next = next;
	}
	
	
}
