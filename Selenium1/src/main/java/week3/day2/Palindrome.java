package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String name="madam";
		String str="";
		
		char[] charArray = name.toCharArray(); 
		
		for (int i = charArray.length-1; i >=0; i--) {
			str+=charArray[i];	
			
		}
        System.out.println("The reversed string is :" +str);
        
        if(name.equalsIgnoreCase(str))
        {
        	System.out.println("The given String is Palindrome");
    
        }
        else {
        	System.out.println("The given String is not a Palindrome");
        }
	}

}
