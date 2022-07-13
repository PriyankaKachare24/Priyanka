package logical_Programs;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value of a");
		int a = sc.nextInt();
		System.out.println("Please enter value of b");
		int b = sc.nextInt();
		int sum=a+b;
		System.out.println("Sum of a and b is "+sum);

	}

}
