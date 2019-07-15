package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrSwap
{

	public static void main(String[] args)
	{
     ArrayList<String> src = new <String> ArrayList();
     src.add("msd");
     src.add("abd");
     src.add("veer");
     src.add("viraj");
     
     //System.out.println("before swap"+src);
    // src.set(2,"msd");
     //src.set(0,"veer");
     
       Collections.swap(src, 1, 3);
     //System.out.println("after swap"+src);
    // src.removeAll(src);
       System.out.println( src.isEmpty());
       System.out.println( src);
       src.ensureCapacity(2); 
       System.out.println("src size ="+src.size());
       src.trimToSize();
       System.out.println(src.size());
       
	}

}
