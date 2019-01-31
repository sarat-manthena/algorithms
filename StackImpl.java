package com.learning.ds;

class StackLocal{
	int capacity =2;
	int[] stackLocal = new int[capacity];
	int top=0;
	
	public void push(int data) {
		if(size() == capacity)
			resizeArray();
		stackLocal[top] = data;
		top=top+1;
		
	}
	
	public int pop() {
		int value=0;
		if(top ==0)
			System.out.println("Empty Stack");
		value = stackLocal[top];
		stackLocal[top] =0;
		top = top-1;
		reduceArray();
		return value;
	}
	
	public void reduceArray() {
		int length = size()-1;
		int[] tmpArray = new int[length];
		for(int i=0; i< length; i++) {
			tmpArray[i] = stackLocal[i];
		}
		stackLocal = tmpArray;
		
	}
	
	public void resizeArray() {
		int length = size();
		int[] tmpArray = new int[capacity*2];
		for(int i=0; i<length;i++) {
			tmpArray[i] = stackLocal[i];
		}
		stackLocal = tmpArray;
		capacity = capacity*2;
	}
	
	public int size() {
		return top;
	}
}

public class StackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This class to implement stack using arrays;
		 */

	}

}
