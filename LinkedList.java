class LinkedList
	{
		static Node head;
		
		static class Node
		{
			int data;
			Node next;
		
			Node(int data)
			{
			 this.data=data;
				next=null;
			}
		}
		
		Node reverse(Node node)
		{
			Node prev=null;
			Node current = node;
			Node next =null;
			while(current!= null)
			{
				next=current.next;
				current.next=prev;
				prev = current;
				current = next;
			}
			
			node = prev;
			return node;
		}
		
		void display(Node node){
			while(node != null)
			{
				System.out.print(node.data+" ");
				node=node.next;
			}
		}
		
		public static void main(String... args)
		{
			LinkedList k=new LinkedList ();
			k.head= new Node(1);
			k.head.next= new Node(5);
			k.head.next.next= new Node(1);
			k.head.next.next.next= new Node(2);
			k.head.next.next.next.next= new Node(3);
			k.head.next.next.next.next.next= new Node(4);
			k.head.next.next.next.next.next.next= new Node(5);
			
			System.out.println("original list");
			k.display(head);
			head=k.reverse(head);
			System.out.println("\nRevese list");
			k.display(head);
			
		}
	}