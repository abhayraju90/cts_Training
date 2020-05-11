package com.cognizant.practice;

public class RemoveDuplicate {
	
	   static int removeDuplicate(int arr[],int n){
		int res=1;
		int temp[] = new int[n];
		temp[0]=arr[0];
		for(int i=1;i<n;i++){
			if(temp[res-1]!=arr[i]){
				temp[res]=arr[i];
				res++;
			}
		}
		for(int i=0;i<res;i++){
			arr[i]=temp[i];
		}
		return res;
	}
	   public static int removeDuplicate1(int arr[],int n){
		   int res=1;
		   for(int i=1;i<n;i++){
			   if(arr[res-1]!=arr[i]){
				   arr[res]=arr[i];
				   res++;
			   }
		   }
		   return res;
	   }
	public static void main(String[] args) {
		int arr[]= {10,20,20,30,30,30};
		int n=arr.length;
		System.out.println(removeDuplicate(arr,n));
		System.out.println(removeDuplicate1(arr,n));
	}

}
