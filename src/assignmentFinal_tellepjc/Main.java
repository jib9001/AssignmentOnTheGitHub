/******************************************************
 * Connor Tellep                                      *
 * Final Assignment                                   *
 * 04/19/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Sum of Fifth Powers Project                        *
 ******************************************************/


package assignmentFinal_tellepjc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		//imports the scanner class for user input
		Scanner sc = new Scanner(System.in);
		//declares a string to store the user input
		String input;
		
		//greets user and prompts for input
		System.out.println("Welcome to the Fifth power digit sum calculator thing!");
		System.out.println("Are you sure you can handle what's about to go down? yes/no");
		//receives input
		input = sc.nextLine();
		
		//uses input to determine appropriate action
		if(input.equalsIgnoreCase("yes"))
		{
			//declares an integer to store the number given by the fifth power sum method
			//also statically calls said method 
			int digitPowersSum = DigitFifthPowers.getFifthPowerSum();
			//prints out the results of the method
			System.out.println("The sum of all the numbers that can be written as "
					+ "the sum of fifth powers of their digits is " + digitPowersSum);
		}
		else if(input.equalsIgnoreCase("no"))
		{
			//expresses disappointment in user not being able to handle what was about to go down
			System.out.println("You disappoint me");
		}
		else
		{
			//prints an error message if the input was invalid
			System.err.println("Error! CANNOT_RESOLVE_INPUT_TO_COMMAND");
		}
		//closes the scanner object to prevent resource leak
		sc.close();
	}

}
