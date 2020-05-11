package com.cognizant.practiceinrarfile;

public class DuchNationalFlag {
	public static void duchNationalFlag(int arr[],int n,int pivot){
		int low_boundary=0;
		int high_boundary=arr.length-1;
		int i=0;
		while(i<=high_boundary){
			if(arr[i]<pivot){
				swap(arr,i,low_boundary);
				low_boundary++;
				i++;
			}else if(arr[i]>pivot){
			   swap(arr,i,high_boundary);
			   high_boundary--;
			   
			   
			}else
			{
				i++;
			}
		}
		for(i=0;i<n;i++){
			System.out.println(+arr[i]);
		}
		
	}
	public static void swap(int a[],int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

	public static void main(String[] args) {
		int arr[]={5,2,4,4,6,4,4,3};
		int n=arr.length;
		int pivot=4;
		duchNationalFlag(arr, n, pivot);

	}

}
