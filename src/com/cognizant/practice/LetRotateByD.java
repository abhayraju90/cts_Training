package com.cognizant.practice;

public class LetRotateByD {
	
     public static void leftRotateByOne(int arr[],int n){
    	 int temp=arr[0];
    	 for(int i=1;i<n;i++){
    		 arr[i-1]=arr[i];
    	 }
    	 arr[n-1]=temp;
     }
     public static void leftRotate(int arr[],int n,int d){
    	 for(int i=0;i<d;i++){
    		 leftRotateByOne(arr,n);
    	 }
         for(int i=0;i<n;i++){
        	 System.out.print(arr[i]+",");
         }
     }
	
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int n=arr.length;
		int d=3;
		leftRotate(arr,n,d);

	}

}
