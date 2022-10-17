/* Yazan Hajsaid
 * Jiang Li
 * CSC 222
 * Programming Assignment 5
 */


import java.text.DecimalFormat;
import java.util.*;
public class ProgrammingAssignment5 {

	public static void main(String[] args) { 
		
		
		//variables initialized 
		double investmentAmount, x, monthlyInterestRate = 0, annualInterestRate;
		
		//set decimal format to round to second decimal
		DecimalFormat df = new DecimalFormat("0.00");

		
		Scanner keyboard = new Scanner(System.in); //keyboard initialized

		//user input
		System.out.println("Enter initial amount: ");
		
			investmentAmount = keyboard.nextDouble();
		
			System.out.println("Enter annual interest: ");
			
			annualInterestRate = keyboard.nextDouble();
			
			//divide annual interest rate by 12
			monthlyInterestRate = annualInterestRate/12;
			
			System.out.println("The amount invested: " + investmentAmount);
			System.out.println("Annual interest rate: " + annualInterestRate);
			
				//loop begins
				for(int years = 1; years <= 30; years++) {
					
					//call futureInvestMentValue method to compute
					x = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
					//print result					
					System.out.println("Year: " + years + "\t futureValue: " +  df.format(x));
					
			} //loop ends

	}//end main
		
		
		//future investment value method
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		
		
		//calculate investment value over time
		monthlyInterestRate = monthlyInterestRate + 1;	
		double power = Math.pow(monthlyInterestRate, years * 12);
		double futureInvestmentValue = investmentAmount * power;
		return futureInvestmentValue;
	
		}// end futureInvestValue Method
	
		
	}//end class

/*
 
 
Output: 

Enter initial amount: 
1000
Enter annual interest: 
.09
The amount invested: 1000.0
Annual interest rate: 0.09
Year: 1	 futureValue: 1093.81
Year: 2	 futureValue: 1196.41
Year: 3	 futureValue: 1308.65
Year: 4	 futureValue: 1431.41
Year: 5	 futureValue: 1565.68
Year: 6	 futureValue: 1712.55
Year: 7	 futureValue: 1873.20
Year: 8	 futureValue: 2048.92
Year: 9	 futureValue: 2241.12
Year: 10	 futureValue: 2451.36
Year: 11	 futureValue: 2681.31
Year: 12	 futureValue: 2932.84
Year: 13	 futureValue: 3207.96
Year: 14	 futureValue: 3508.89
Year: 15	 futureValue: 3838.04
Year: 16	 futureValue: 4198.08
Year: 17	 futureValue: 4591.89
Year: 18	 futureValue: 5022.64
Year: 19	 futureValue: 5493.80
Year: 20	 futureValue: 6009.15
Year: 21	 futureValue: 6572.85
Year: 22	 futureValue: 7189.43
Year: 23	 futureValue: 7863.85
Year: 24	 futureValue: 8601.53
Year: 25	 futureValue: 9408.41
Year: 26	 futureValue: 10290.99
Year: 27	 futureValue: 11256.35
Year: 28	 futureValue: 12312.28
Year: 29	 futureValue: 13467.25
Year: 30	 futureValue: 14730.58

 */
