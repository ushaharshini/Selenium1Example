package week1.day2;


/*
 * Goal: To find Fibonacci Series for a given range
 * 
 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
 * 
 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
 * enter
 * 
 * What are my learnings from this code? 1) 2) 3)
 * 
 */

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		 int firstNum=0,secNum=1,sum,range=8;    
		// Print first number
		 System.out.print(firstNum+" "+secNum);//printing 0 and 1    
		 
		// Iterate from 1 to the range
		 for(int i=2;i<range;++i)  //loop starts from 2 because 0 and 1 are already printed  
			 
		 {
			 sum=firstNum+secNum;    // add first and second number assign to sum
			 // System.out.print(" "+sum);    // print sum
				 
			  firstNum=secNum;    // Assign second number to the first number
			  secNum=sum;    // Assign sum to the second number
			  
			  System.out.print(" "+sum);    // print sum
				 
			 }   
		

	}

}
