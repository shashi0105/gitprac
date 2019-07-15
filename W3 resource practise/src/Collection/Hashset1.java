package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) 
	{
	  HashSet <Integer> hs =new HashSet<Integer>();
	  hs.add(25);
	  hs.add(32);
	  hs.add(22);
	  hs.add(31);
	  
	  //System.out.println(hs);
	  Iterator <Integer> itr=hs.iterator();// to iterate through all elements in a hash list
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  System.out.println("number of elements in h_set ="+hs.size());//to get the number of elements in a hash set.
	  System.out.println( hs.removeAll(hs));//to empty an hash set.
	  if(hs.isEmpty()==true)// to test a hash set is empty or not
	  {
		  System.out.println("hs is empty");
	  }else
	    {
		  System.out.println("hs is not empty");
	    }
	}
}
