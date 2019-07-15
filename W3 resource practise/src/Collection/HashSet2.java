package Collection;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) 
	{
	 HashSet <Integer> hs1 =new HashSet();
     hs1.add(35);
     hs1.add(23);
     hs1.add(32);
   //System.out.println(hs1);
     
   //HashSet <Integer> hs2 =new HashSet();
    
     HashSet hs2=(HashSet)hs1.clone();// to clone a hash set to another hash set.
     hs2.add(42);
     hs2.add(16);
   //System.out.println("clone of hs1 ="+hs2);
     
    
     Object [] hsAr = hs2.toArray();//to convert a hash set to an array.
	 for (int i=0; i<hs2.size(); i++)
	  {
		System.out.print(hsAr[i]+" ");
	  }
	 
	}

}
