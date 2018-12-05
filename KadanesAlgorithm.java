package com.learning.arrays;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[] {1,-3,2,1,-2};
		int max = kadanesAlgorithm(inputArray);
		System.out.println(max);

	}
	static int kadanesAlgorithm(int[] a) {
		int max_current = a[0];
		int max_global = a[0];
		for(int i=1; i< a.length-1; i++) {
			max_current = Integer.max(a[i],max_current+a[i]);
			if(max_current > max_global)
				max_global = max_current;
		}
		
		return max_global;
	}

}
