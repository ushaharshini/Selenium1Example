package exercise;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1 ="Usha";
		char[] charArray = s1.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
		
			System.out.println(charArray[i]);
			
		}
	
	}

}
