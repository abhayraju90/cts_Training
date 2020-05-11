package com.cognizant.mock;

public class MaximumProfit {
 
	public static int maxProfit(int arr[],int len){
		int profit=0;
		for(int i=1;i<len;i++){
			if(arr[i]>arr[i-1]){
				profit=profit+(arr[i]-arr[i-1]);
			}
		}
		return profit;
		
	}
	

	public static void main(String[] args) {
		int arr[]={7,1,5,3,6,4};
		int len=arr.length;
		System.out.println("Max profit:::  "+maxProfit(arr, len));

	}

}
