
import java.util.*;

public final class LinkedListTest
{
	public static void main(String args[])
	{
		int Key;
		int NewItem;

		/* create an empty linked list */
		LinkedListClass LL = new LinkedListClass();

		/* create a linked list of n nodes */
		System.out.println("Enter the number of items to append:");
		int n= Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.printf("Enter %1$s items" + "\r\n", n);
		for (int i = 0; i < n; i++)
		{
			NewItem = Integer.parseInt(new Scanner(System.in).nextLine());
			LL.Append(NewItem);
		};
		
	    System.out.println("Display all items from the header:");
		LL.PrintList();
		
		/* Test the operations of linked list */
		System.out.println("Enter 1 for search, 2 for deletion, 3 for append, 4 for remove");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3 || s == 4)
		{
			if (s == 1)
			{
				System.out.println("Enter the key that you want to search:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				Node node = LL.Search(Key);
				if (node != null)
					System.out.printf("The item is found: %1$s" + "\r\n", node.item);
			};
			if (s == 2)
			{
				System.out.println("Enter the key of the item that you want to delete:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				LL.Delete(Key);
				System.out.println("Display all items from the header:");
				LL.PrintList();
			};
			if (s == 3)
			{
				System.out.println("Enter the item that you want to append:");
				NewItem = Integer.parseInt(new Scanner(System.in).nextLine());
				LL.Append(NewItem);
				System.out.println("Display all items from the header:");
				LL.PrintList();
			};
			if (s == 4)
			{
				Node RemoveNode = LL.Remove();
				if (RemoveNode != null)
				{
					System.out.printf("The removed item is: %1$s" + "\r\n", RemoveNode.item);
					System.out.println("Display all items from the header:");
					LL.PrintList();
				}
			};
			System.out.print("\r\n");
			
			System.out.println("Enter 1 for search, 2 for deletion, 3 for append, 4 for remove");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}

	}

}


