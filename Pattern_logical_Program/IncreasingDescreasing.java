package Pattern_logical_Program;

public class IncreasingDescreasing {

	public static void main(String[] args) 
	{
		 //*
		 //**
		 //***
		 //****
		 //***
		 //**
		 //*
		//col=4;row=7
  int star=1;     // Total No of Star in First/Initial Row

  for(int i=1;i<=7;i++)    // Outer for loop for Total No of Rows=7
 
  {
	 
  for(int j=1;j<=star;j++);  //Inner for loop for the column
 
  {
	 System.out.print("*"); 
  }
	System.out.println();
	//star++;
	if(i<4)    // if(i<=3) // for Increasing star; star++

	{
		star++;
	}
	else 
	{
		star--; // for Decreasing star; star--
	}
  }
}
}