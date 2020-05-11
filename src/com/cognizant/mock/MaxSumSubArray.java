package com.cognizant.mock;

public class MaxSumSubArray {

    public static int maxSum(int arr[],int n){
  	  int res=arr[0];
  	  for(int i=0;i<n;i++){
  		  int curr=0;
  		  for(int j=i;j<n;j++){
  			  curr=curr+arr[j];
  			  res=Math.max(res,curr);
  		  }
  	  }
  	  System.out.println("Maximum sum:::"+res);
  	  return res;
  	  
    }
	public static void main(String[] args) {
		int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		maxSum(arr,n);

	}

}
