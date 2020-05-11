package com.cognizant.practice;

public class MaxDifference {

    public static int maxDiff(int arr[],int n){
    	int res=arr[1]-arr[0];
    	for(int i=0;i<n;i++){
    		for(int j=i+1;j<n;j++){
    			res=Math.max(res,arr[j]-arr[i]);
    		}
    	}
    	System.out.println("maximum difference:    "+res);
    	return res;
    }
    public static int maxDiffSecondSolution(int arr[],int n){
    	int res=arr[1]-arr[0];
    	int minValue=arr[0];
    	for(int j=1;j<n;j++){
    		res=Math.max(res, arr[j]-minValue);
    		minValue=Math.min(minValue, arr[j]);
    	}
    	System.out.println("maximum difference:    "+res);
    	return res;
    }
	public static void main(String[] args) {
		int arr[]={2,3,10,6,4,8,1};
		int n=arr.length;
		maxDiff(arr, n);
		maxDiffSecondSolution(arr,n);
		

	}

}
