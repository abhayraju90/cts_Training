package com.cognizant.practice;

public class firstNonRepeatingCharecter {
    
	static int NO_OF_CHAR=256;
	static char count[] = new char[NO_OF_CHAR];
	public static void getCharCount(String str){
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)]++;
		}
	}
	public static int firstNonRepeating(String str){
		getCharCount(str);
		int index=-1;
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i)]==1){
				index=i;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks"; 
        int index =  firstNonRepeating(str); 
          
        System.out.println(index == -1 ? "Either all characters are repeating or string " + 
                   "is empty" : "First non-repeating character is " +  str.charAt(index)); 
    } 


	}
