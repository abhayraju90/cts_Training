package com.cognizant.practice;

public class PowerOfTen {

   public static boolean isPowerOfTen(long x){
	   while(x>9 && x%10==0){
		   x=x/10;
	   }
	   if(x==1){
		   return true;
	   }else{
		   return false;
	   }
   }
	public static void main(String[] args) {
		
		boolean y=isPowerOfTen(1000000000);
		System.out.println("power of 10 or not:::: "+y);

	}

}
