package javaprograms;

import java.util.*;  
class SortList{  
 public static void main(String args[]){  
 
  List<String> list1=new ArrayList<String>();  
  list1.add("C++");  
  list1.add("Java");  
  list1.add("python");  
  list1.add("C");
  list1.add("C");
 
  
  
  
  Collections.sort(list1);  
   
  for(String lang:list1)  
    System.out.println(lang);  

 System.out.println("Sorting numbers...");  

  List<Integer> list2=new ArrayList<Integer>();  
  list2.add(21);  
  list2.add(11);  
  list2.add(51);  
  list2.add(1);  
  
 
  Collections.sort(list2);  
   
  for(Integer number:list2)  
    System.out.println(number);  
 }  
   
}  
	