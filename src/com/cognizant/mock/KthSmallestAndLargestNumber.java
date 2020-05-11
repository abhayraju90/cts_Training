package com.cognizant.mock;
public class KthSmallestAndLargestNumber {
    public static void getElement(Integer arr[],int k){
    	Arrays.sort(arr);
    	int smallest= arr[k-1];
    	int largest= arr[(arr.length-1)-k];
    	System.out.println("kth smallest element::  "+smallest);
    	System.out.println("kth largest element::  "+largest);
    }
  
	public static void main(String[] args) {
		Integer arr[]={5,8,4,9,20,60,40};
		int k=2;

	}

}
