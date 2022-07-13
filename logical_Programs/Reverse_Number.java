package logical_Programs;

public class Reverse_Number {

	public static void main(String[] args) 
	{
		int num = 1996;
		String strNum = Integer.toString(num);//toString method return a"String"
		String rev="";
		for(int i=strNum.length()-1;i>=0;i--) 
		{ 
			rev=rev+strNum.charAt(i);
		}
		int revNum=Integer.parseInt(rev);//parseInt method returns a "integer value"
        System.out.println("Original Number is "+num);
        System.out.println("Reverse Number is "+revNum);
	}

}
