package Collection;

import java.util.ArrayList;

public class c1 
{

	public static void main(String[] args)
	{
     ArrayList<String> a1 = new ArrayList();
     a1.add("nik");
     a1.add("Sam");
     a1.add("Pinki");
     a1.add("Chunky");
     
     ArrayList<String> a2 = new ArrayList();
     a2.add("ram");
     a2.add("sham");
     a2.add("Ghansham");  
     a2.add("koli");  
     
     ArrayList<String> a3 = new ArrayList();
     a3.add("oswal");
     a3.add("Bhat");
     a3.add("Unadkat");
     a3.add("samuel");
     
     int j = 0 ; int k=0;
     for (int i=0; i<a1.size(); i++)
       {
    	 System.out.print(a1.get(i)+" ");
    	 
		 for (; j<a2.size(); j++)
		  {
			 System.out.print(a2.get(j)+" ");
		     j++;
			 for (; k<a3.size();  k++) 
			 {
				 System.out.print(a3.get(k)+" ");
		         k++;
				 System.out.println();
				 break;
			 }
			break;
			
		  }
	   }
       
	}
}
