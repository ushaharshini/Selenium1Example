package javaPrograms;
/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
 * removing all non-alphanumeric characters, it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				String str = "A man, a plan, a canal: Panama";
			String replaceAll = str.replaceAll("[^a-zA-Z0-9]","");
				String lowerCase = replaceAll.toLowerCase();
				char[] charArray = lowerCase.toCharArray();
				String temp = "";
				//int strlength = str.length();
				System.out.println(lowerCase);
				
				for (int i = charArray.length - 1; i >= 0; i--) {
					// d) Add the char into rev
					//System.out.println(charArray.charAt(i));
					temp = temp + charArray[i];
				}
				//System.out.println(temp);

				/*
				 * e) Compare the original String with the reversed String, if it is same then
				 * print palinDrome
				 */
				if (lowerCase.equals(temp)) {
					System.out.println("is palindrome");
				} else {
					// rev=rev+length;
					System.out.println("is not palindrome");

				}

			}
		
	}


