package Pattern_logical_Program;

public class EquilatearlTriangle_Upword_withSpace {

	public static void main(String[] args) {
//		    *
//		   * *
//	      * * *
//		 * * * *
//		* * * * *
  int space=4;
  int star=1;
  for(int i=1;i<=5;i++) //Outer for loop for number of rows
  {
	  for(int j=1;j<=space;j++) //Inner for loop for space
	  {
		  System.out.print(" ");
	  }
	  for(int k=1;k<=star;k++) 
	  {
		 System.out.print("* "); 
	  }
	  System.out.println();
	  space --;
	  star ++;
  }
	}

}
