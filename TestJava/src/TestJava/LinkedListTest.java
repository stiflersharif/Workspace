package TestJava;


public class LinkedListTest {
	Node head;
	Node tail;	
	public Node getNode(int data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
		return n;
	}
	
	public void insertNode(int data) {
		Node new_Node = getNode(data);
		if(head == null) {
			head = new_Node;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_Node;
			tail = temp;
		}	
		
	}
	
	public void show_LinkedList() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public int size() {
		Node node = head;
		int count=0;
		while(node!=null) {
			count++;
			node = node.next;
		}
		return count;
	}
}
