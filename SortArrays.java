package com.learning.arrays;

public class SortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[] {0,2,1,2,0};
		//Before sort
		System.out.println("Before sort:");
		printArray(inputArray);
		//Using insertion sort - Time complexity O(n2)
		for(int i=1; i< inputArray.length;i++) {
			for(int j=i; j > 0;j--) {
				if(inputArray[j] < inputArray[j-1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j-1];
					inputArray[j-1]=temp;
				}
			}
		}
		System.out.println("After sort:");
		printArray(inputArray);
		
		//Bubble sort
		int[] inputArray1 = new int[] {0,2,1,2,0};
		for(int i=0; i< inputArray1.length;i++) {
			for(int j=0; j< inputArray1.length-1;j++) {
				if(inputArray1[j] > inputArray1[j+1]) {
					int temp = inputArray1[j+1];
					inputArray1[j+1] = inputArray1[j];
					inputArray1[j] = temp;
				}
			}
		}
		System.out.println("Bubble Sort result:");
		printArray(inputArray1);
		
		//Using mid and switch case time complexity O(n)
		int[] inputArray2 = new int[] {0,2,1,2,0};
		int lo=0,mid=0;
		int temp=0;
		int hi=inputArray2.length-1;
		while(mid<=hi) {
			switch(inputArray2[mid]) {
					case 0:
						temp = inputArray2[lo];
						inputArray2[lo] = inputArray2[mid];
						inputArray2[mid] = temp;
						lo++;
						mid++;
						break;
					case 1:
						mid++;
						break;
					case 2:
						temp = inputArray2[hi];
						inputArray2[hi] = inputArray2[mid];
						inputArray2[mid] = temp;
						hi--;
						break;
			}
		}
		System.out.println("Sort linear");
		printArray(inputArray2);

	}
	static void printArray(int[] a) {
		for(int i=0; i< a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
	
		
	}

}
