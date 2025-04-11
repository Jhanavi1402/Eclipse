package com.tnsif.example.questions;

//Find the largest element in an array
//input: [10,20,5,30,15]
//output: 30

public class MaxArrayExample {

	public static void main(String[] args) {
		int[] arr = {10,20,5,30,15};
		int max= arr[0];//aasume 1st element is a max
		for (int i=0;i< arr.length;i++) {
			if ( arr[i]>max ) {
				max =arr[i]; //updates max
			}
		}
		System.out.println("max value is:" + max);
			

	}

}
