/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if (head == null)
		return null;
 
	Node pointer = head;
 
	// Copy every node
  // Insert to list
	while (pointer != null) {
		Node copy = new Node(pointer.val);
		copy.next = pointer.next;
		pointer.next = copy;
		pointer = copy.next;
	}
 
	// Copy random pointer for each new node
	pointer = head;
	while (pointer != null) {
		if (pointer.random != null)
			pointer.next.random = pointer.random.next;
		pointer = pointer.next.next;
	}
 
	// Break list to two
	pointer = head;
     Node newHead = head.next;
	while (pointer != null) {
		Node temp = pointer.next;
		pointer.next = temp.next;
		if (temp.next != null)
			temp.next = temp.next.next;
		pointer = pointer.next;
	}
 
	return newHead;
        
    }
}
