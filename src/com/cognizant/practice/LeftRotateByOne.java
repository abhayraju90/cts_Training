package com.cognizant.practice;

public class LeftRotateByOne {
	
	public static void leftRotate(int arr[],int n){
		int temp=arr[0];
		for(int i=1;i<n;i++){
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
		for(int i=0; i<n;i++){
			System.out.print(arr[i]+",");
		}
		
	}


	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int n= arr.length;
		leftRotate(arr,n);

	}

}
