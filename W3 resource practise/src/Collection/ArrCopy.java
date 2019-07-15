package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrCopy {

	    public static void main(String[] args) {
		
		ArrayList<String> arr =new ArrayList();
        arr.add("csk");
        arr.add("rcb");
        arr.add("kkr");
        
        System.out.println("arr ="+arr);
        
        ArrayList<String> slr =new ArrayList();
        slr.add("dc");
       
        System.out.println("slr ="+slr);
        slr.addAll(arr);//To copy elements of previous collection.
        Collections.copy(arr,slr);
        System.out.println("after copying elements of arr,slr ="+slr);
        System.out.println("arr="+arr); 
        System.out.println("slr="+slr); 
	}

}
