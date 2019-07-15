package Basic_Test_I;

import java.util.Scanner;

public class BTI_55 {

	public static void main(String[] args) {
		System.out.println("enter seconds");
		Scanner sc =new Scanner(System.in);
		int sec =sc.nextInt();
		int hour=sec/3600;
		int sec1=sec%3600;
		int min =sec1/60;
		int sec2 =sec1%60;
		System.out.println(hour+":"+min+":"+sec2);
		
	}

}
