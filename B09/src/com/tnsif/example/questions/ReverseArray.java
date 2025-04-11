package com.tnsif.example.questions;
//reverse an array
//input: [1,2,3,4,5]
//output: [5,4,3,2,1]

public class ReverseArray {
	
	public static void main (String[] args) {
		int arr[] = {1,2,3,4,5};//create an array
		int start = 0;//declare a variable
		int end = arr.length -1;//
		
		while (start < end) {
			//swap the elements from both ends
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("Reversed Array: " );
		for(int num : arr) {
			System.out.println(num + "");
			
		}
		
		
	}

}
