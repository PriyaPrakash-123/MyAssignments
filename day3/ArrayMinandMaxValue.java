package week1.day3;

import java.util.Arrays;

public class ArrayMinandMaxValue {
	public static void main(String[] args) {
		int[] nums = {45, 567, 67, 8787, 5657, 23, 19};
		//Sort the Array
		Arrays.sort(nums);
		System.out.println("Minimum Value is :" +nums[0]);
		int length = nums.length;
		//Index will be Length-1
		//To check maximum value 
		int x = nums[length-1];
		System.out.println("Maximum Value is :" +x );
		//To check 2nd largest value 
		int y = nums[length-2];
		System.out.println("The Second Largest Number of this array is :" +y);
		
	}

}
