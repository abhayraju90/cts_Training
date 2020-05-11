package com.cognizant.practice;

public class RobotMovement {
   
	public static void findRobotPosition(String str ){
		int ucounter =0,dcounter=0,lcounter=0,rcounter=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='L'){
				lcounter++;
			}else if(str.charAt(i)=='R'){
				rcounter++;
			}else if(str.charAt(i)=='U'){
				ucounter++;
			}else{
				dcounter++;
			}
		}
		System.out.println("final position("+(rcounter-lcounter)+","+(ucounter-dcounter)+")");
		
	}
  
	public static void main(String[] args) {
		String str="UDDLRL";
		findRobotPosition(str);

	}

}
