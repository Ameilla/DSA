package LinkedList;

import java.util.*;



public class Search {
	public static void main(String[] args)
	{
		SinglyLinkedList List =new SinglyLinkedList();
		List.InserAtBegin(36);
		List.InserAtBegin(30);
		List.InserAtBegin(20);
		List.InserAtBegin(20);
		List.InserAtBegin(20);
		List.InserAtBegin(10);
		List.InserAtBegin(10);
		
		List.Display();
		System.out.println();
		List.reverse();
		List.Display();
		SinglyLinkedList.LL middleNode = List.GetMid();
		System.out.println(middleNode.data);
		System.out.println(List.GetNthNode(11));
		List.Display();
		System.out.println();
		List.sort();
		System.out.println();
//		List.RemoveDuplicatesFromSortedList();
		List.InsertNodeInSortedList(25);
		List.Display();
		

		
		
		
		
		
		
	}

}
