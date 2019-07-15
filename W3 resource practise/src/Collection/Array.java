package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Array {

	public static void main(String[] args) 
	{
	  ArrayList <String> a = new ArrayList();
	  a.add("xyz");
	  a.add("pqr");
	  a.add("lmn");
	  a.add("cjh");
	  a.add("def");
	  
	  System.out.println(a);
   // Collections.shuffle(a);
	  Collections.reverse(a);
	  System.out.println(a);
	}

}
