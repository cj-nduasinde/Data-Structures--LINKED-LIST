
import java.util.*;

public class LinkedListClass
{
	public Node header;

	public LinkedListClass()
	{
		header = null;
	}

	public final Node Search(int key)
	{
		Node current = header;
		while (current != null && current.item != key)
			current = current.link;
		if (current == null) 
			System.out.println("There is no such item!");
		return current;
	}

	public final void Append(int newItem)
	{
		Node newNode = new Node(newItem);
		newNode.link = header;
		header = newNode;
	}

	public final Node Remove()
	{
		Node x = header;
		if ( x == null) 
			System.out.println("It is empty!");
		else
			header = header.link;
		return x;
	}

	public final Node searchPrevious(int key)
	{   
		if (header == null) 
           return header;
		else
		{
		  Node current = header;
		
		  while (!(current.link == null) && (current.link.item != key))
			current = current.link;
		 return current;
		}
	}


	public final void Delete(int key)
	{
		if (header == null)
			System.out.println("It is empty!");
		else
		{
			if (header.item == key) // The header is the one to be deleted.
				header = header.link;
			else 
			{
				Node p = searchPrevious(key);
				if (p.link == null)
					System.out.println("There is no such item!");
				else
					p.link = p.link.link;
			}
		}
	}

	public final void PrintList()
	{
		if (header == null)
			System.out.println("It is empty!");
		else
		{
			Node current = header;
			System.out.println(current.item);
			while (!(current.link == null))
			{
				current = current.link;
				System.out.println(current.item);
			}
		}
	}
}


