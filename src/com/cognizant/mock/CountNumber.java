package com.cognizant.mock;

public class CountNumber {

	public static int countNumber(int arr[],int len){
		int count =0;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]+1==arr[j]){
					count++;
					break;
				}
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		int arr[]={1,3,5,7};
		int len=arr.length;
		System.out.println("Count Number::: "+countNumber(arr, len));
		
    }

}
