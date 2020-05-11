package com.cognizant.mock;
public class UniqueAnagram {
   public static boolean isAnagram(String str1,String str2){
	   boolean flag=true;
	   if(str1.length()!=str2.length()){
		   flag= false;
	   }else{
		   char arr1[]=str1.toLowerCase().toCharArray();
		   char arr2[]=str2.toLowerCase().toCharArray();
		   Arrays.sort(arr1);
		   Arrays.sort(arr2);
		   flag = Arrays.equals(arr1, arr2);
		   if(flag==true){
			   return true;
		   }else{
			   return false;
		   }
	   } 
   }
	public static void main(String[] args) {
		String str[]={"cat","tac","one","bat","tab"};
		int len=str.length;
		int k=0;
		String tempArr[]=new String[5];
		boolean status = false;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-1;j++){
				status=isAnagram(str[i], str[j]);
				if(status){
					break;
				}
			}
			if(status==false){
				tempArr[k]=str[i];
				k++;
				}
			}
	}
}
