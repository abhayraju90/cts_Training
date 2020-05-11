package com.cognizant.mock;

public class SpecialNumber{     
    
    public static int isSpecialNumber(int num){  
        int rem = 0, sqSum = 0;  
           
        while(num > 0){  
            rem = num%10;  
            sqSum = sqSum + (rem*rem);  
            num = num/10;  
        }  
        return sqSum;  
    }  
      
    public static void main(String[] args) {  
        int num = 19;  
        int result = num;  
          
        while(result != 1 && result != 4){  
            result = isSpecialNumber(result);  
        }  
        if(result == 1)  
            System.out.println(" This is a Special number"+num );  
        else if(result == 4)  
            System.out.println(" This is not a Special number"+num );     
    }  
}  
