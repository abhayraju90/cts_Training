package com.cognizant.practiceinrarfile;

public class MoveZeroToBeginning {
    
	public static void moveZeroesToBegnning(int arr[], int n){
		int boundary=0;
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				swap(arr,i,boundary);
				boundary++;
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
		moveZeroesToBegnning(arr, n);
	}

}
