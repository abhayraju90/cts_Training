package com.cognizant.practiceinrarfile;

public class ReverseArray {

	public static void reverseArray(int arr[],int n){
		int start=0;
		int end=arr.length-1;
		while(start<end){
			swap(arr,start,end);
			start++;
			end--;
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
		int arr[]={1,4,2,7,3};
		int n=arr.length;
		reverseArray(arr, n);

	}

}
