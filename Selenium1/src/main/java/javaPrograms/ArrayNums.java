package javaPrograms;
/*
 * Java Problem (6/20)

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class ArrayNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,2,1,1,1,2,2};
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
				System.out.println(arr[i] + " appeared " + freq[i] + " times" );
			}
			
		}
		
				
		
		}
		

	}


