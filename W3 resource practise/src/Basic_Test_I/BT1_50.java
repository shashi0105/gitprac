package Basic_Test_I;

public class BT1_50
{

	public static void main(String[] args)
	{
	  int counter=0;
	  System.out.println("Divided by 3");
      for (int i=1; i <100; i++)
	  {
		if( i%3==0)
		{
			System.out.print(i+", ");
			counter++;
		}
		
		if(i==99)
		{
			System.out.println("num= "+counter);
		}
	  }
	  
	    System.out.println("\n\nDivided by 5");
	    for (int j = 1; j < 100; j++) 
	    {
	    	if( j%5==0)
			{
				System.out.print(j+", ");
				counter++;
			}
	    	if(j==99)
			{
				System.out.println("num= "+counter);
				
			}
		 }
	    
		    
	        System.out.println("\n\nDivided by 3 & 5");
	    	for (int k= 1; k< 100; k++) 
	    	{
	    		if(k%3==0 && k%5==0)
		        {
			     System.out.print(k+", ");
			     counter++;
		        }
	    		if(k==99)
	    		{
	    			System.out.println("num= "+counter);
	    		}
			}
	          
	  
	   
   }  

}
