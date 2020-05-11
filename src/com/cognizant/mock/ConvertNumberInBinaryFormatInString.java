package com.cognizant.mock;
public class ConvertNumberInBinaryFormatInString {
    public static void getNumberFromString(String str){
    	int[] tempArray =new int[str.length()]; 
    	char[] charArray = str.toCharArray();
    	int i=0;
    	for(char ch :charArray ){
    		if(Character.isDigit(ch)){
    			tempArray[i]=Character.getNumericValue(ch);
    			i=i+1;
    		}
    	}
    	int[] binaryNum = new int[tempArray.length];
    	for(int p=0;p<tempArray.length;p++){
    	int j=0;
    	if(tempArray[p]!=0){
    		while(tempArray[p]>0){
    			binaryNum[j] = tempArray[p]%2; 
    			tempArray[p] = tempArray[p]/2; 
                j++;
    		}
    	}
    	for (int k=j-1; k >= 0; k--) {
            System.out.print(binaryNum[k]); 
        }
    	}
    	}
	public static void main(String[] args) {
		String str = "Krish7CTS8";
        getNumberFromString(str);

	}

}
