
public class CircularSinglyLinkedList {

	private ListNode last;
	private int length;
	
	/*
	 * Create an inner class
	 */
	private class ListNode {
		private ListNode next;
		private int data;
		
		/*
		 * parameterized constructor 
		 */
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public CircularSinglyLinkedList() {
		last = null;
		length = 0;
	}
	
	/*
	 * get the length of list
	 */
	public int length() {
		return length;
		
	}
	
	/*
	 * Check if list is empty
	 */
	public boolean isEmpty() {
		return length==0;
	}
	
	/*
	 * logic for Creating a circular linked list
	 */
	public void createCircularLL() {
		ListNode l1 = new ListNode(10);
		ListNode l2 = new ListNode(15);
		ListNode l3 = new ListNode(20);
		ListNode l4 = new ListNode(25);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l1;
		
		last = l4;
	}
	
	/*
	 * Trverse throgh the linkedList
	 */
	public void traverseList() {
		if(last==null) 
			return;
		ListNode first = last.next;
		while(first != last) {
			System.out.println(first.data);
			first = first.next;
		}
		System.out.println(first.data);
	}
	
	/*
	 * Inserting an element at the start of a list
	 */
	public void insertElementAtbeginning() {
		
		ListNode futureFirst = new ListNode(5);
		if(last==null) 
			last=futureFirst;
		//ListNode currentFirst = last.next;
		futureFirst.next = last.next;
		last.next = futureFirst;
		length++;
		System.out.println("After Inserting element At First Place");
		traverseList();
		
		
	}
	
	/*
	 * Starting point of a program
	 */
	public static void main(String[] args) {
		CircularSinglyLinkedList cLinkList = new CircularSinglyLinkedList();
		cLinkList.createCircularLL();
		System.out.println("Traversing throgh the linked list");
		cLinkList.traverseList();
		cLinkList.insertElementAtbeginning();
	}
}	
