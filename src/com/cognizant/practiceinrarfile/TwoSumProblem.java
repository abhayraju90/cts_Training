package com.cognizant.practiceinrarfile;

import javafx.util.Pair;

public class TwoSumProblem {

	public static int[] twoSum(int arr[],int target){
		int start=0; 
		int end = arr.length-1;
		while(start<end){
			int sum=arr[start]+arr[end];
			if(sum<target){
				start++;
			}else if(sum>target){
				end--;
			}else{
				int a[]=new int[2];
				a[0]=arr[start];
				a[1]=arr[end];
				System.out.println("pair::::"+a[0]+" ---"+a[1]);
				return a;
			}
		}
		return null;
		
	}

	public static void main(String[] args) {
		int arr[]={1,2,4,5,6};
		int n=arr.length;
		int target=9;
		twoSum(arr,target);

	}

}
