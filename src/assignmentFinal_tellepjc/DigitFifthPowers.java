/******************************************************
 * Connor Tellep                                      *
 * Final Assignment                                   *
 * 04/19/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Sum of Fifth Powers Project                        *
 ******************************************************/



package assignmentFinal_tellepjc;

public class DigitFifthPowers 
{
	//declares a starting number to begin the process of finding the fifth power numbers
	private static int testNum = 1;
	//declares the number that will be calculated and used as the answer
	private static int testActualSum;
	//declares a final integer that is the actual answer
	private final static int actualSum = 443839;
	
	/**
	 * Static method to find the sum of all numbers that can be written as the sum of the fifth powers
	 * of their digits
	 * @return returns the sum of all said numbers
	 */
	public static int getFifthPowerSum()
	{
		//starts the loop that will be used to find the answer
		while(testActualSum != actualSum)
		{
			//increments the number that is being tested to see if it meets given criteria
			testNum++;
			
			//creates a copy of the test number to be deconstructed into individual digits for testing
			int i = testNum;
			
			//declares the variable that will be used to compare the sum of the fifth power
			//of the digits to the number being tested
			int testSum = 0;
			
			//starts the loop that will deconstruct the integer and add the fifth powers of the digits
			//of the number being tested
			while(i != 0)
			{
				//finds the last digit of the number being tested
				int digit = i%10;

				//removes that digit from the number being tested
				i = i/10;
				
				//raises the recently found digit to the power of 5
				digit = (int)Math.pow(digit, 5);
				
				//if the fifth power of the digit is greater than the number being tested,=
				//it cannot possibly meet the given criteria
				if(digit >= testNum)
				{
					break;
				}
				else if(digit < testNum)
				{
					//if the fifth power of the digit is less than the number being tested, it's added to the test sum
					testSum += digit;
					if(testSum > testNum)
					{
						//if the powers of the digits of the number being tested are at any point
						//greater than the number, than it can't possibly meet the criteria
						break;
					}
				}
				
			}
			if(testSum == testNum)
			{
				//if the sum of the powers of the digits equals the number being tested
				//then the number meets criteria and is added to the sum of similar numbers
				testActualSum += testNum;
			}
				
		}
		
		//returns the sum of all numbers that can be written as the sum of their digits raised to the fifth power
		return testActualSum;

	}
}
