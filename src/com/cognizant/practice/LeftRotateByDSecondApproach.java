package com.cognizant.practice;

public class LeftRotateByDSecondApproach {
	
	public static void leftRotate(int arr[],int n,int d){
		int temp[]=new int[d];
		for(int i=0;i<d;i++){
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++){
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++){
			arr[n-d+i]=temp[i];
		}
		for(int i=0;i<n;i++){
		System.out.println(arr[i]);
		}		
	}
	
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int n=arr.length;
		int d=2;
		leftRotate(arr,n,d);
	}

}
