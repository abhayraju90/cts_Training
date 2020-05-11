package com.cognizant.mock;
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class ReverseStringWithoutEffectingSpecialChar {
  public static void reverseStringWithoutEffectingSpecialChar(String str){
    char[] charArray=str.toCharArray();
    int left=0,right=charArray.length-1;
    while(left<right){
      if(!Character.isAlphabetic(charArray[left])){
        left++;
      }
      else if(Character.isAlphabetic(charArray[right])){
        right--;
      }
      else{
         char temp = charArray[left];
              charArray[left]=charArray[right];
              charArray[right]=temp;
              left++;
              right--;
      }
      
    }
    for(int i=0;i<charArray.length;i++){
      System.out.println("Reverse String::: "+charArray[i]); 
    }
  }
  public static void main(String[] args) {
     String str = "Ab,c,de!$";
     reverseStringWithoutEffectingSpecialChar(str);
     
  }
}

