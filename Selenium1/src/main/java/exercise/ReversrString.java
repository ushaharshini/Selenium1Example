package exercise;

public class ReversrString {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		
		String name="AryaKrish";	
		char[] charArray = name.toCharArray();
		
		for (int i = charArray.length-1; i >=0; i--) {
			
			//name+=charArray[i];
			System.out.println(charArray[i]);
			
			
		}
	//System.out.println(charArray[i]);*/
		
		String originalStr = "Hello";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
		
		//count number of words in the string
	
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);


	}

}
