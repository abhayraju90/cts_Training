package com.cognizant.practiceinrarfile;

public class MaxSumSubArray {
     public static int maxSumSubArray(int arr[]){
    	 int maxSum=arr[0]; 
    	 int maxEndingHere=arr[0];
    	 for(int i=1;i<arr.length;i++){
    		 maxEndingHere=Math.max(maxEndingHere+arr[i],arr[i]);
    		 maxSum=Math.max(maxSum,maxEndingHere);
    		 
    	 }
    	 System.out.println(""+maxSum);
    	 return maxSum;
    	                
     }

	public static void main(String[] args) {
		int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		maxSumSubArray(arr);

	}

}
