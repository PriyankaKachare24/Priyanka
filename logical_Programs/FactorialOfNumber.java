package logical_Programs;

public class FactorialOfNumber {

	public static void main(String[] args) {
		//5!=5*4*3*2*1
		int num=9;
		int fact=1;
		for(int i=9;i>=1;i--)//9,8,7,6,5,4,3,2,1
		{
			fact=i*fact;
//			9*1=9;
//			9*8=72;
//			72*7=504;
//			504*6=3024;
//			3024*5=15120;
//			15120*4=60480;
//			60480*3=181440;
//			181440*2=362880;
		}
       System.out.println("Factorial of num is "+fact);
	}

}
