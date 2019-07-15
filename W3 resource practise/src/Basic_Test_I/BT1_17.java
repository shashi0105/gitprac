package Basic_Test_I;

import java.util.Scanner;

public class BT1_17 {

	public static void main(String[] args) {
		int rem,quot,i=1;
		System.out.println("Enter a Decimal number");
		Scanner sc =new Scanner(System.in);
	    int dec_num = sc.nextInt();
	    
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
	    System.out.println(z);

	    
	    int rem2,quot2,i2=1,dec_num2;
		System.out.println("Enter a Decimal number");
		//Scanner sc =new Scanner(System.in);
	    dec_num2 = sc.nextInt();
	    
	    quot2 = dec_num2;
	    
	    int bin_num2 [] =new int[100];
	
	    
	    while(quot2!=0)
	    {
	    	bin_num2[i++]=quot2%2;
	    	quot2=quot2/2;
	    }
	    for (int j=i-1; j>1; j--) 
	    {
			System.out.print(bin_num[j]);
		}
	    String s2=bin_num.toString();
	    int z2 =Integer.parseInt(s);
	    System.out.println(z2);
	    
	}

}
