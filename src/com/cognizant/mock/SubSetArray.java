package com.cognizant.mock;

import java.util.HashSet;

public class SubSetArray {
	public static boolean SubsetCheck(int arr1[],int arr2[]){
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++){
			if(!hs.contains(arr1[i])){
			   hs.add(arr1[i]);
			}
		}
		for(int i=0;i<arr2.length;i++){
			if(!hs.contains(arr2[i])){
				return false;
			}
		}
		return true;
		
	}

   
	public static void main(String[] args) {
		int arr1[]={1,4,7,3,5,6};
		int arr2[]={1,6,5};
		System.out.println("is SubSet :::   "+SubsetCheck(arr1, arr2));
	}

}
