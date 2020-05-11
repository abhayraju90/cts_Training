package com.cognizant.mock;

public class FindMissingNumberInSortedArray {

   public static void findMissingElements(int arr[]){
	   for(int i=1;i<arr.length;i++){
		   int curr=arr[i];
		   int prev=arr[i-1];
		   int diff=curr-prev;
		   if(diff>1){
			   for(int j=1;j<diff;j++){
				   System.out.println("missing element::  "+(prev+j));
			   }
		   }
	   }
	   
   }
	public static void main(String[] args) {
		int arr[]={0,1,2,4,5,8};
        findMissingElements(arr);
	}

}
