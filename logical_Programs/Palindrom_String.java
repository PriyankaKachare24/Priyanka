package logical_Programs;

import java.util.Scanner;

public class Palindrom_String
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a String");
		String orginal = sc.next();
		String reverse="";
		for(int i=orginal.length()-1;i>=0;i--)
		{
		reverse=reverse+orginal.charAt(i);
		}
		System.out.println("Original String is "+orginal);
		System.out.println("Reverse String is "+reverse);
		if(orginal.equals(reverse))
		{
		System.out.println("Given string is Palindrome");
		}
		else
		{
		System.out.println("Given string is not Palindrome");
		}
		
	}

}
