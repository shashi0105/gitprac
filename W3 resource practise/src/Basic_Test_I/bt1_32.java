package Basic_Test_I;

import java.util.Scanner;

public class bt1_32 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		if(n1!=n2)
		{
			System.out.println(n1+"!="+n2);
		}
		if(n1==n2)
		{
			System.out.println(n1+"="+n2);
		}
		if(n1<=n2)
		{
			System.out.println(n1+"<="+n2);
		}
		if(n1>=n2)
		{
			System.out.println(n1+">="+n2);
		}
		if(n1>n2)
		{
			System.out.println(n1+">"+n2);
		}
		if(n1<n2)
		{
			System.out.println(n1+"<"+n2);
		}
		
	}

}
