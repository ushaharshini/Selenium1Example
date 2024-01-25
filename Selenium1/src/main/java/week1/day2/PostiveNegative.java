package week1.day2;



/*Assignment:3
Problem statement: Convert a negative number to positive number
-----------------------------------------------
Pseudocode: 
1. Initialize an integer with a negative number like, int number = -40;
2. Check if the number is a negative number Hint : any number that is lesser than zero is a negative number
3. If so, convert the number to a positive number


To check the positive and negative of a number, we have implemented the following logic in the Java program.

If number>0 the number is positive.
If number<0 the number is negative.
If a number is neither positive nor negative, the number is equal to 0.
Let's implement the above logic in a Java program using the if-else statement


 */

public class PostiveNegative {

	
	
	public static void main(String[] args) {
		
		{  
			//number to be check  
			int num=-40;  
			//checks the number is greater than 0 or not  
			if(num>0)  
			{  
			System.out.println("The number is positive.");  
			}  
			//checks the number is less than 0 or not  
			else if(num<0)  
			{  
			System.out.println("The number is negative.");  
			}  
			//executes when the above two conditions return false  
			else  
			{  
			System.out.println("The number is zero.");  
			}  
			}  
		

	}

}
