package com.cognizant.practice;

public class StockBySell {

      public static int maxProfit(int arr[],int n){
    	  int profit=0;
    	  for(int i=1;i<n;i++){
    		  if(arr[i]>arr[i-1]){
    			  profit+=(arr[i]-arr[i-1]);
    		  }
    	  }
    	  System.out.println("max profit::::  "+profit);
    	  return profit;
      }
	public static void main(String[] args) {
		int arr[]={1,5,3,8,12};
		int n=arr.length;
		maxProfit(arr,n);

	}

}
