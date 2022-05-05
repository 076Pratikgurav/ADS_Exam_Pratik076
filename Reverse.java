class Reverse
{
	 static  Node head;
	 
	  static class Node
	 {
		int data;
		Node next;
		
		Node(int d)
		{
		 data =d;
		 next =null;
		}
		
	}
	
   Node  reverse(  Node curr,Node prev)
	{
		if(head==null)
			return head;
		
		if(curr.next==null)
		{
			head =curr;
			curr.next=prev;
			return head;
		}
		
		Node next1 = curr.next;
		curr.next =prev;
		reverse(next1,curr);
		return head;
	}
	
	void printlist(Node node)
	{
		while (node != null)
		{
			System.out.println(node.data+" ");
			node =node.next;
		}
	}
	
	
	public static void main(String args[])
	{
		Reverse r = new Reverse();
		r.head = new Node(1);
		r.head.next = new Node(5);
		r.head.next.next= new Node(1);
		r.head.next.next.next= new Node(2);
		r.head.next.next.next.next= new Node(3);
		r.head.next.next.next.next.next= new Node(4);
		r.head.next.next.next.next.next.next= new Node(5);
		
		System.out.println("Orignal Linked list");
		r.printlist(head);
		Node res =r.reverse(head,null);
		System.out.println("");
		System.out.println("");
		System.out.println("Reversed Linked list ");
		r.printlist(res);	
	}
}