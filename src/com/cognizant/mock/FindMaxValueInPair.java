package com.cognizant.mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindMaxValueInPair {
	
	public static void FindMaxValue(int arr[], int len){
		int maxInteger=0;
		int positiveValue=0;
		Set<Integer> pairSet=new HashSet<Integer>();
		//ArrayList al=new ArrayList();
		for(int i=0;i<len;i++){
			if(arr[i]>0){
				pairSet.add(arr[i]);
			}
		}
		for(int i=0;i<len;i++){

			if(arr[i]<0){
				if(pairSet.contains(-arr[i])){
					maxInteger=Math.abs(arr[i]);	
				    positiveValue=Math.max(maxInteger,positiveValue );
				    //al.add(-arr[i]);
				    
				}	
			}
		}
		//Collections.sort(al);
		//int maxValue= (Integer) al.get(al.size()-1);
		System.out.println("max value::   "+positiveValue);
		
	}

	
	public static void main(String[] args) {
		int arr[]={5,-5,3,2,-2,-3,4,};
		int len =arr.length;
		FindMaxValue(arr,len);
		

	}

}
