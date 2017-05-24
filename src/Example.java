import java.util.*;
import java.util.Iterator;


class Example{  	
	
	
 public static void main(String args[]){  
	 
  ArrayList<String> list=new ArrayList<String>();
  list.add("Ravi");
  list.add("Hema");  
  list.add("Prabu");  
  list.add("Kala");  
  System.out.println(list); 
  Iterator<String> itr=list.iterator(); 
 // list.add("Divi");
 // itr.remove();
  while(itr.hasNext()){  
  // System.out.println(itr.next());  
   String temp=itr.next();
   if(temp.equals("Ravi"))
   {
	   list.add("Divi");
   }
   
	  
   if(temp.equals("Ravi"))
   {
   itr.remove();  
   }
   System.out.println();  
   }  
  System.out.println(list); 
 }  
}  