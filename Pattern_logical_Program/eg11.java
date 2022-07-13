package Pattern_logical_Program;

public class eg11 {

	public static void main(String[] args)
	{
		  //*****
		  //****
		  //***
		  //**
		  //*
		  //**
		  //***
		  //****
		  //*****

int star=5;
		
		for(int i=1;i<=9;i++) {
			
			for(int j=1;j<=star;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			if(i<=4) {
				star--;
			}
			else {
				star++;
			}
			
		}
		
	
	}

}
