package Pattern_logical_Program;

public class EquilateralDownward {

	public static void main(String[] args) 
	{
//		*******
//		 *****
//		  ***
//		   *
		//rows=4;col=7
		 
		int space=0;
		int star=7;
		for(int i=1;i<=4;i++) //outer for loop 
		 {
			for(int j=1;j<=space;j++)
			{
			  System.out.print(" ");
		    }
		    for(int k=1;k<=star;k++) //inner for loop for column
		    {
			System.out.print("*");
		    }
         System.out.println();
         space ++;     //Increment of space by 1
         star=star-2; // Decrement of star by 2
	    }

	}

}
