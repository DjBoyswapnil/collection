package Arraylist_demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistt {

	public static void main(String[] args) 
	{
		List al = new ArrayList();
		al.add("Swapnil");
		al.add("shreya");
		al.add("mansi");
		al.add("koko");
		al.add(0, "Anji"); //PQR is added at 0 index.
		al.add("Vaishwa");
		
		System.out.println(al);
		
//		Iterator itr = al.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		al.clear();
//		System.out.println(al);
//		System.out.println(al.clone());
		
		System.out.println(al);
		System.out.println(al.lastIndexOf("Sumi")); //last position
		System.out.println(al.lastIndexOf("Tejas")); //-1
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.contains("Tejas"));
		System.out.println(al.indexOf("Sumi"));
		al.remove("Sumi");
		System.out.println(al);
//		al.removeRange(0,3);
		
		System.out.println(al.subList(1, 3));
		 	 
		System.out.println(al.size());
		al.set(0, "KKKKK");
		System.out.println(al);
	}
	

}