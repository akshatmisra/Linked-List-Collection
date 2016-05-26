import java.util.LinkedList;
import java.util.Queue;

// Stack implementation using two queue

public class LinkedListImpl {

	Queue st1 ;
	Queue st2 ;
	
	int size;
	LinkedListImpl()
	{
		st1 = new LinkedList();
		st2 = new LinkedList();
		size = 0;
	}
	
	public void push(char data)
	{
		if(st1.isEmpty())
			st2.add(data);
		else
			st1.add(data);
			
		size++;
	}
	
	public int size()
	{
		return size;
	}
	
	public char pop()
	{
		if(st1.isEmpty())
		{
			for (int i = 0; i< st2.size() -1;i++)
			{
				st1.add(st2.poll());
			}
			return (char)st2.poll();
		}
		else if(st2.isEmpty() )
		{
			for(int i = 0; i< st1.size()-1; i++)
			{
				st2.add(st1.poll());
			}
			return (char)st1.poll();
		}
		size--;
		return '$';
	}
	
	public static void main(String args[])
	{
		LinkedListImpl stack = new LinkedListImpl();
		stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        //queue.enqueue("E");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        stack.push('E');
        System.out.println(stack.size());
        //queue.enqueue("F");
        System.out.println(stack.pop());
        System.out.println(stack.size());

	}
}
