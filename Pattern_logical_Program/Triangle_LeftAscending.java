package Pattern_logical_Program;

public class Triangle_LeftAscending 
{

	public static void main(String[] args) 
	{
//		*
//		**
//		***
//		****
//		*****
	 //rows=5;col=5
				int star=1; //number of Star in 1st Row
				for(int i=1;i<=5;i++) //Outer loop for Rows
				{
					for(int j=1;j<=star;j++) //Inner loop for star
					{
						System.out.print("*");
					}
					System.out.println();
					star ++; 
	            }
	}
}
