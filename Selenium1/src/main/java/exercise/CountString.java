package exercise;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Akshaya";
		int count=0;
		
		char[] charArray = name.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]=='a') {
				
				count++;
				
				
			}
		}
		System.out.println(count);
		
		
	}

}
