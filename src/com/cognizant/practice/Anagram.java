package com.cognizant.practice;

public class Anagram {
	
	static boolean isAnagram(char s1[], char s2[]){
		if(s1.length!=s2.length){
			return false;
		}
		int count[] = new int[256];
		for(int i=0; i<s1.length;i++){
			count[s1[i]]++;
		}
		for(int i=0; i<s2.length; i++){
			count[s2[i]]--;
		}
		for(int i=0; i<256; i++){
			if(count[i]!=0){
				return false;
			}
		}
        return true;
	}
	
	public static void main(String[] args) {
        char str1[] = ("geekp").toCharArray(); 
        char str2[] = ("gekes").toCharArray(); 
  
        if (isAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + "anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
	
	}

}
