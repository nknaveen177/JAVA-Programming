
import java.util.Scanner;

class Methods{

	public static void main(String[] args){

	DisplayName();  // Method definition 

	System.out.println("Finding a square using methods \n");
	System.out.println("Enter a value to finding square.. \n");

	Scanner scan= new Scanner(System.in);
	int value=scan.nextInt();
	int Square_Value=Square(value); // calling square method

	System.out.println("The square is " +Square_Value);


}

// method declaration 
private static void DisplayName(){

System.out.println("NAVEENKUMAR R");

}

private static int Square(int value){
return value*value;

}


}