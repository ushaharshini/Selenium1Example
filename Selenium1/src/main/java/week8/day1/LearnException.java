package week8.day1;

public class LearnException {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int[] nums= {2,3,4};
		try {
			System.out.println(a/b);
			System.out.println("I am inside Try block");
		try {
			System.out.println(nums[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("End the Program");
		}
		
	}
}


