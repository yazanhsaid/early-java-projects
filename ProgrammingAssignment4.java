/* Yazan Hajsaid
 * Jiang Li
 * CSC 222
 * Programming assignment 4
 */

import java.util.*;
public class ProgrammingAssignment4 {

	public static void main(String[] args) {

		int n=0, count; // initialize variables
		
		Scanner keyboard = new Scanner(System.in); //scanner initialized
		
		System.out.println("How many prime numbers would you like? "); //ask user for prime number count

		count=keyboard.nextInt();
		
		System.out.println("The first prime numbers are: ");
		//processing and comput
		while(count>=1){ //outer loop - counts prime numbers
			
			n++; //increment
			
			
			//pass through int n to isprime method. determines if number is true or false
			if(isprime(n) == true)
				System.out.println(n); //print result
			
			else if(isprime(n) == false)
			continue;	

			--count; //increment down until while statement is incorrect
		}

				
			keyboard.close(); // close keyboard

		}
	
		
		//isprime method used to determine if number given is true or false.
	public static boolean isprime(int n) {
			if(n==0 || n==1)
				return false;
			
			for(int m=2; m<n; m++)
			{
				if(n%m==0)
					return false;
				}
			
			return true;
			
			
		}// end main
	}// end class
/* output
 

How many prime numbers would you like? 
10
The first prime numbers are: 
2
3
5
7
11
13
17
19
23
 

 
 */

