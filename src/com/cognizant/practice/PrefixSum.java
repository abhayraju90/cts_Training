package com.cognizant.practice;

public class PrefixSum {
      
	public static int[] reatePrefixSumArray(int arr[],int n,int l,int r){
		int prefix_sum[]=new int[n];
		prefix_sum[0]=arr[0];
		for(int i=1;i<n;i++){
			prefix_sum[i]=prefix_sum[i-1]+arr[i];
		}
		return prefix_sum;
	}
	public static int getSum(int arr[],int n,int l, int r){
		int[] prefix_sum=reatePrefixSumArray(arr,n,l,r);
		int sum;
		if(l!=0){
		   sum=prefix_sum[r]- prefix_sum[l-1];
		}
		else{
			sum = prefix_sum[r];
		}
		return sum;
	}
    
	public static void main(String[] args) {
		int arr[]={2,8,3,9,6,5,4};
		int n=arr.length;
		int l=2;
		int r=6;
		System.out.println("sum::::"+getSum(arr, n, l, r));

	}

}
