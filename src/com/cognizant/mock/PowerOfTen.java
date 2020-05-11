package com.cognizant.mock;
import java.io.*;
import java.util.*;

	// Check if a number is power of 10 (i.e.: 1000 it is, 500 is not).
	//10 --> true beacuse 10 power 1 = 10
	//1 -->true beacuse 10 power 0 = 1
	//11-->false beacuse ts not power 10
	//1000--o/p : true beacuse 10 power 3=1000


	class PowerOfTen {
	  public static boolean isPowerofTenOrNot(int number){
	    int count=0;
	    while(number>0 && number%10==0){
	          number = number/10;
	          count++;
	    }
	    if(number==1){
	      System.out.println("true because 10 power "+count+"");
	      return true;
	    }else
	       return false;
	  }
	  public static void main(String[] args) {
	     System.out.println(isPowerofTenOrNot(1000000));
	  }
	}
	

