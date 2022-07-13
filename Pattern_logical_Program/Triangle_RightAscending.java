package Pattern_logical_Program;

public class Triangle_RightAscending {

	public static void main(String[] args) 
	{   
      //		*
      //	   **
      //	  *** 
      //	 ****
      //	*****
		//row=5;col=5
				int space=4;  // on the first row there is no space
		        int star=1;  // outer loop number of Rows=5
		        for(int i=1;i<=5;i++) 
		        {
		        	for(int j=1;j<=space;j++) //Inner forloop for space
		        	{
		        		System.out.print(" ");
		        	}
		        	for(int k=1;k<=star;k++) 
		        	{
		        		System.out.print("*");
		        	}
		        	System.out.println();
		        	space --; //space Decreases
		            star ++; //star Increases
		        }

	}

}
