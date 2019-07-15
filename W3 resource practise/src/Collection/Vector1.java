package Collection;

import java.util.Collections;
import java.util.Vector;

public class Vector1 
{
    public static void main(String[] args)
	{
		Vector <String> v1 =new <String> Vector();
		v1.add("jawed");
		v1.add("viraj");
	    v1.add("akshay");
	    v1.add("vj");
	    v1.add("karan");
	    v1.set(2, "hitesh");
	    System.out.println(v1);
	   /* System.out.println(v1.get(1));
	    System.out.println(v1.lastElement());
	    System.out.println(v1.size());
	    System.out.println(v1.capacity());
	    System.out.println(v1.clone());
	    System.out.println(v1.firstElement().equals("jawed"));
	    System.out.println(v1.indexOf("akshay"));
	   // Object [] arr = new String[v1.size()];
	    Object [] src =  v1.toArray();
	    for (int i = 0; i < src.length; i++) {
			System.out.println(src[i]);	
		}*/
	    //v1.removeAll(v1);
	    System.out.println(v1.isEmpty());
	    System.out.println("capacity before trim ="+v1.capacity());
	    v1.trimToSize();                    //Trims the capacity to size of array
	    System.out.println(v1.size());
	    System.out.println("capacity after trim ="+v1.capacity());
	    v1.iterator();
	}

}
//Vector has default capacity of 10 ,then as the requirement increases size also get increased
//To convert vector to array of return type of object is preffered