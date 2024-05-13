package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class queuedemo 
{

	public static void main(String[] args) 
	{
		PriorityQueue<String> obj=new PriorityQueue<String>();  
		obj.add("Swapnil");
		obj.add("tejas");
		obj.add("harshal");
		System.out.println(obj);
	}

}
