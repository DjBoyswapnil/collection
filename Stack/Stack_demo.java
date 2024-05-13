package Stack;

import java.util.Stack;

public class Stack_demo 
{

	public static void main(String[] args) 
	{
		Stack<String> obj=new Stack<String>();
		obj.push("swapnil");
		obj.add("Neha");
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		
	}

}
