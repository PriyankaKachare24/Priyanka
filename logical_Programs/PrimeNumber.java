package logical_Programs;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num=13;
		int count=0;
		for(int i=2;i<num;i++)//2,3,4...10
		{
		if(num%i==0)
		{
		count++;
		break;
		}
		}
		if(count==1)
		{
		System.out.println("Given number is not a prime number");
		}
		else
		{
		System.out.println("Given number is a prime number");
		}
	}

}
