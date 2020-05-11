package com.cognizant.practice;

public class ReverseArray {

    public static void reverseArray(int arr[],int n){
    	int low=0;
    	int high=n-1;
    	while(low<high){
    		int temp=arr[low];
    		arr[low]=arr[high];
    		arr[high]=temp;
    		low++;
    		high--;
    	}
        for (int k = 0; k < n; k++) { 
            System.out.println(arr[k]); 
        }
    }
	public static void main(String[] args) {
	    int arr[] ={10,5,7,30};
	    int n=arr.length; 
	    reverseArray(arr,n);
	    /*ReverseArray ra= new ReverseArray();
	    ra.reverseArray(arr, n);
	    System.out.println(ra.reverseArray(arr, n));*/

	}

}
