
import java.util.*;

public final class DoubleLinkedListTest
{
	public static void main(String args[])
	{
		int Key;
		int num, NewItem, preKey;

		/* create an empty double linked list */
		DoubleLinkedListClass DLL = new DoubleLinkedListClass();

		/* create a linked list of n nodes */
		System.out.println("Enter the number of items to append:");
		int n= Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.printf("Enter %1$s items" + "\r\n", n);
		for (int i = 0; i < n; i++)
		{
			NewItem = Integer.parseInt(new Scanner(System.in).nextLine());
			DLL.AppendToHead(NewItem);
		};
		
		System.out.println("The items/integers in the current double linked list from the header to the tail:");
		DLL.PrintList();
		System.out.println("The items/integers in the current linked list from the tail back to the header:");
		DLL.PrintReverse();

		/* Test the opeations of double linked list */
		System.out.println("Enter 1 for search, 2 for deletion, 3 for append to head, 4 for remove from head, 5 for append to tail, 6 for remove from tail");
		int s = Integer.parseInt(new Scanner(System.in).nextLine()); // search an item by its key
		while (s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s == 6)
		{
			if (s == 1)
			{
				System.out.println("Enter a key that you want to search:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				Node node = DLL.Search(Key);
				if (node != null)
					System.out.printf("The item is found: %1$s" + "\r\n", node.item);
			};
			if (s == 2)
			{
				System.out.println("Enter the key of the item that you want to delete:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				DLL.Delete(Key);
				System.out.println("The items in the current the double linked list:");
				DLL.PrintList();
			};
			if (s == 3)
			{
				System.out.println("Enter the item that you want to append:");
				NewItem = Integer.parseInt(new Scanner(System.in).nextLine());
				DLL.AppendToHead(NewItem);
				System.out.println("The items in the current double linked list from the header to the tail:");
				DLL.PrintList();
			};
			if (s == 4)
			{
				Node RemoveNode = DLL.RemoveFromHead();
				if (RemoveNode != null)
				{
					System.out.printf("The removed item is: %1$s" + "\r\n", RemoveNode.item);
					System.out.println("The items in the current linked list from the header to the tail:");
					DLL.PrintList();
				}
			};

			if (s == 5)
			{
				System.out.println("Enter the item that you want to append:");
				NewItem = Integer.parseInt(new Scanner(System.in).nextLine());
				DLL.AppendToTail(NewItem);
				System.out.println("The items in the current linked list from the header to the tail:");
				DLL.PrintList();
			};

			if (s == 6)
			{
				Node RemoveNode = DLL.RemoveFromTail();
				if (RemoveNode != null)
				{
					System.out.printf("The removed item is: %1$s" + "\r\n", RemoveNode.item);
					System.out.println("The items in the current double linked list from the header to the tail:");
					DLL.PrintList();
				}
			};

			System.out.println("Enter 1 for search, 2 for deletion, 3 for append to head, 4 for remove from head, 5 for append to tail, 6 for remove from tail");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}
	}
}
