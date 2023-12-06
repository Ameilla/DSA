package DSA;

public class  LinkedList{
	
	public class LL
	{
		int data;
		LL next;
		LL(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public LL head;
	
	public void InserAtBegin(int data)
	{
		LL newnode = new LL(data);
		newnode.next = head;
		head = newnode;
	}
	public void InsertAtPosition(int data,int position)
	{
		LL newnode = new LL(data);
		if(position ==1)
		{
			newnode.next=head;
			head=newnode;
		}
		else
		{
			int count=1;
			LL prev = head;
			while(count<position-1)
			{
				prev=prev.next;
				count++;
			}
			LL current = prev.next;
			newnode.next = current;
			prev.next = newnode;
		}
	}
	public void InsertAtEnd(int data)
	{
		LL newnode = new LL(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		LL temp = head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
	}
	
	public int DeleteFirst()
	{
		LL t=head;
		head=head.next;
		t.next=null;
		return t.data;
	}
	public int DeleteAtPostion(int position)
	{
		if(position==1)
		{
			head=head.next;
			return head.data;
		}
		else
		{
			LL previous = head;
			int count=1;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			LL current=previous.next;
			previous.next=current.next;
			return current.data;
		}
	}
	public int DeleteLast()
	{
		if(head==null)
		{
			return -1;
		}
		if(head.next == null)
		{
			LL t = head;
			head=head.next;
			t.next=null;
			return t.data;
		}
		LL previous=null;
		LL current = head;
		while(current.next!=null)
		{
			previous = current;
			current = current.next;
		}
		previous.next=null;
		return current.data;
		
	}
	public void Display()
	{
		LL temp= head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	public static void main(String[] args)
	{
		LinkedList List =new LinkedList();
		List.InserAtBegin(12);
		List.InserAtBegin(20);
		List.InsertAtEnd(25);
		List.InsertAtPosition(500,4);
		System.out.println(List.DeleteFirst());
		System.out.println(List.DeleteLast());
		System.out.println(List.DeleteAtPostion(2));
		List.Display();
		
	}	
}