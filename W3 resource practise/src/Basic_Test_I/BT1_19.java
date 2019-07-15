package Basic_Test_I;

import java.util.Scanner;

public class BT1_19 {

	public static void main(String[] args) 
	{
		int rem,quot,i=1,dec_num;
		System.out.println("Enter a Decimal number");
		Scanner sc =new Scanner(System.in);
	    dec_num = sc.nextInt();
	    
	    quot = dec_num;
	    
	    int bin_num [] =new int[100];
	
	    
	    while(quot!=0)
	    {
	    	bin_num[i++]=quot%2;
	    	quot=quot/2;
	    }
	    for (int j=i-1; j>1; j--) 
	    {
			System.out.print(bin_num[j]);
		}
	    String s=bin_num.toString();
	    int z =Integer.parseInt(s);
	    
	}

}
