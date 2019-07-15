package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Ar
{

	public static void main(String[] args)
	{
	  ArrayList<String> col =new ArrayList();
		col.add("Yellow");
		col.add("Orange");
		col.add("Black");
		col.add(1,"Red");//to add element at specific index.
		System.out.println(col.set(0,"Pink"));
		
		System.out.println("list before sort "+col);
		Collections.sort(col);///*****To sort elements in ascending or descending
		System.out.println("list after sort "+col);
		
		//Iterator<String> itr =col.iterator();//To iterate through each element of ArrayList.
		/*while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		System.out.println(col.contains("Pink"));//to retrieve element at specific index.
	    
		
	}

}
