package logical_Programs;

public class ReverseMiddleString 
{

	public static void main(String[] args) 
	{
		String a="I LOVE MY INDIA";
		// even place reverse 
		String [] ar=a.split(" ");
		// ar[]={"I", "LOVE","MY","INDIA"}
		// 1 2 3 4
		for(int i=0;i<=ar.length-1;i++)//0,1,2
		{
			if(i%2!=0)
			{
				String s=ar[i];
				ar[i]=reverse(s); //{"I" "LOVE" "YM" "INDIA"}
			}
		}
		for(int i=0;i<=ar.length-1;i++)
		{
		System.out.println(ar[i]);

	    }

	}

	private static String reverse(String input)
	{
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
		rev=rev+input.charAt(i);
		}
		return rev;
	}
}
