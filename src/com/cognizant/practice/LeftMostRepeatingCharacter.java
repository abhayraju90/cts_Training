package com.cognizant.practice;

public class LeftMostRepeatingCharacter {

   public static int findRepeatFirst(String s){
	   int p=-1;
	   for(int i=0;i<s.length();i++){
		   for(int j=i+1;j<s.length();j++){
			   if(s.charAt(i)==s.charAt(j)){
				   p=i;
				   break;
			   }
		   }
           if (p != -1) 
               break;
	   }
	   return p;
   }
	

	
	
	public static void main(String[] args) {
		String str= "geeksforgeeks";
		int pos=findRepeatFirst(str);
		if(pos==-1){
			System.out.println("not found");
		}else{
			System.out.println(str.charAt(pos));
		}

		

	}

}
