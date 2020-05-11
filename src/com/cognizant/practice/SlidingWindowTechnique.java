package com.cognizant.practice;

public class SlidingWindowTechnique {

    public static int getMaximunArraySum(int arr[],int n,int k){
    	int curr_sum=0;
    	for(int i=0;i<k;i++){
    		curr_sum+=arr[i];
    	}
    	int max_sum=curr_sum;
    	for(int i=k;i<n;i++){
    		curr_sum+=(arr[i]-arr[i-k]);
    		max_sum=Math.max(max_sum,curr_sum);
    	}
    	System.out.println("Max sum::::  "+max_sum);
    	return max_sum;
    }
	
	public static void main(String[] args) {
		int arr[]={1,8,30,-5,20,7};
		int k=3;
		int n=arr.length;
		getMaximunArraySum(arr, n, k);

	}

}
