package com.cognizant.mock;

import java.io.*;
import java.util.*;


class GroupingOfAnagram {
  public static void main(String[] args) {
    String strs[]={"eat","tea","tan","ate","nat","bat"};
    List<List<String>> result = groupingAnagrams(strs);
    String s="";
	result.forEach(s -> System.out.println(s + ""));
   
  }
  public static List<List<String>> groupingAnagrams(String inputStr[]){
    List<List<String>> result= new ArrayList<List<String>>();
    HashMap<String,List<String>> hm =new HashMap<String,List<String>>();
    for(String str:inputStr){
      char[] charArr=str.toCharArray();
      Arrays.sort(charArr);
      String key = new String (charArr);
      if(hm.containsKey(key)){
        hm.get(key).add(str);
      }else{
        List<String> strList = new ArrayList<String>();
        strList.add(str);
        hm.put(key,strList);
      }
    }
    result.addAll(hm.values());
    return result;
  }
}

