package logical_Programs;

public class Reverse_Num_Without_String {

	public static void main(String[] args) 
	{
		//1996-->6991
		// System.out.println(11/2);
		// System.out.println(11%2);
		// System.out.println(1996/10);
		// System.out.println(1996%10);
		//
		// System.out.println(199%10);
		// System.out.println(19%10);
		//System.out.println(1%10);
		int num = 1996;
		int revNum=0;
		for(int i=num;i>0;i=i/10) //1996,199,19,1
		{ 
			int rem=i%10;//6,9,9,1
			revNum=revNum*10+rem;
			//0+6-->6
			//6*10+9-->69
			//69*10+9->699
			//699*10+1-->6991
		}
		System.out.println("Original Number is "+num);
        System.out.println("Reverse Number is "+revNum);

	}

}
