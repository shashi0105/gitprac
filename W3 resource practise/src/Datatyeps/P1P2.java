package Datatyeps;

import java.util.Scanner;

public class P1P2 {

	public static void main(String[] args) {
		System.out.println("Enter a temperature in farenhite");
		Scanner s =new Scanner(System.in);
		long farenhite =s.nextLong();
		long celcius = (5*(farenhite-32))/9;
		System.out.println("temperature in celcius ="+celcius);

		
		//1 inch = 0.0254m;
	
		System.out.println("Enter a measurement in inches");
		long inch =s.nextLong();
	    double meters=(inch*0.0254);
	    System.out.println("meters ="+meters);
	}

	
	//long year=365 day;
	//long day=24 hour;
	//long hour =60 minute
}
