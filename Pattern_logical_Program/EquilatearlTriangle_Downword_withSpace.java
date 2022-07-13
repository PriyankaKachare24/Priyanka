package Pattern_logical_Program;

public class EquilatearlTriangle_Downword_withSpace {

	public static void main(String[] args) {
//		* * * * *
//	     * * * *
//		  * * *
//		   * *
//		    * 
		int space=0; //Number of Space in 1st Row
		int star=5; //Number of Star in 1st Row
		for(int i=1;i<=5;i++) //outer for loop
        {
			for(int j=1;j<=space;j++) //inner for loop
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) //inner for loop
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
	}

}
