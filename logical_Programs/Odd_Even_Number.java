package logical_Programs;

import java.util.Scanner;

public class Odd_Even_Number {

	public static void main(String[] args) 
	{
		// System.out.println(11/2);/ used for division
		// System.out.println(11%2);% used for Reminder
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter value");
		int a = sc.nextInt();
		if(a%2==0)
		{
		System.out.println("Number is even number");
		}
		else
		{
		System.out.println("Number is odd number");
		}

		
	}

}
