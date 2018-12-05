package com.learning.arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[] {1,2,3,7,5};
		int sum=12;
		int finalSum = 0;
		int start=1;
		int end=1;
		while(finalSum != sum) {
			finalSum = inputArray[start-1];
			for(int j=start; j< inputArray.length; j++) {
			      finalSum = finalSum + inputArray[j];
			      if(finalSum == sum) {
			    	  end=j+1;
			    	  break;
			      } else if(finalSum > sum)
			    	  break;
			}
			start++;
		}
		System.out.println("The sum is present from "+(start)+" end "+(end));

	}

}
