package javaPrograms;
/*
 * Java Problem (7/20)

 Given an integer array nums, return true if any value appears at least twice in the array,
  and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class ArrayNumsTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = {1,2,3,1};
		int[] freq =new int[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			int no=arr[i];
			int count=1;
			for (int j = i+1; j < arr.length; j++) {
				if(no ==arr[j]) {
					count++;
					freq[j]=-1;
					
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]!=-1) {
				System.out.println(arr[i] );
			}
			
		}
		
}
	}
