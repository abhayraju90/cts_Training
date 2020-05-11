package com.cognizant.mock;

public class CandyDistribution {
    public static int candy(int[] ratingValue) {
        int sum = 0;
        if (ratingValue.length == 0){
            return sum;
        }
        int[] leftCandy = new int[ratingValue.length];
        int[] rightCandy = new int[ratingValue.length];
        for (int i = 0 ; i < ratingValue.length; i++){
        	leftCandy[i] = 1;
            rightCandy[i] = 1;
        }
        for (int i = 0 ; i < ratingValue.length-1; i++){
            if (ratingValue[i] < ratingValue[i+1])
            	leftCandy[i+1] = leftCandy[i] + 1;
        }
        for (int i = ratingValue.length-1 ; i > 0 ; i--){
            if (ratingValue[i-1] > ratingValue[i])
            	rightCandy[i-1] = rightCandy[i] + 1;
        }
        for (int i = 0 ; i < ratingValue.length ; i++){
            sum += findMax(leftCandy[i] , rightCandy[i]);
        }
        return sum;
    }
    public static int findMax(int a , int b){
        return a > b ? a : b;
    }

	public static void main(String[] args) {
		int arr[]={1,2,2};
		System.out.println("Sum of candy  "+candy(arr));	
	}
}
