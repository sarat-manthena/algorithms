package com.learning.arrays;


public class MissingNumber {

	public static void main(String[] args) {
		// TODO Given an array has a missing number from 1 to 100. Need to find the missing number
		int[] arrayA = {1,2,3,4,5,6,8};
		//First find the sum of number
		int size = arrayA.length;
		//This is the logic for finding sum of number given a sorted range of numbers
		int total = (size+1)*(size+2)/2;
		System.out.println("Total:"+total);
		for(int i=0; i< size; i++) {
			total = total - arrayA[i];
		}
		System.out.println("Total:"+total);

	}

}
