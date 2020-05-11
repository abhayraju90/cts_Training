package com.cognizant.practiceinrarfile;

public class MoveZeroToEnd {

	public static void moveZeroToEnd(int arr[],int n){
		int boundary=arr.length-1;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==0){
				swap(arr,i,boundary);
				boundary--;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(+arr[i]);
		}
	}
	public static void swap(int a[],int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

	public static void main(String[] args) {
		int arr[]={4,2,0,1,0,3,0};
		int n=arr.length;
		moveZeroToEnd(arr, n);
	}

}
