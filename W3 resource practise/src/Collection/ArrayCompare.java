package Collection;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayCompare
{

	public static void main(String[] args)
	{
		
		ArrayList<String> arr =new ArrayList();
        arr.add("csk");
        arr.add("rcb");
        arr.add("kkr");
        
        System.out.println("arr ="+arr);
        
        ArrayList<String> slr =new ArrayList();
       
        slr.add("csk");
        slr.add("rcb");
        slr.add("dc");
        //slr.add("kkr");
        System.out.println("slr ="+slr);
       
        System.out.println(arr.containsAll(slr));
        
        ArrayList<String> c3 =new ArrayList<>();
        for(String e : arr)
        c3.add(slr.contains(e)? "yes":"no");
        System.out.println(c3);   
        /*
        slr.addAll(arr);//To copy elements of previous collection.
        Collections.copy(arr,slr);
        System.out.println("after copying elements of arr,slr ="+slr);
        System.out.println("arr="+arr); 
        System.out.println("slr="+slr);// TODO Auto-generated method stub
        */
	}

}
