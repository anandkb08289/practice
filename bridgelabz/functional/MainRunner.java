package org.bridgelabz.functional;
import org.bridgelabz.utility.*;
public class MainRunner {

	public static void main(String[] args) 
	{
          /*String s1=Utility.getString();
          String s2=Utility.getString();
       boolean  rs = Utility.isAnangram(s1, s2);
       if(rs)
        System.out.println("strings are anagram");
       else
    	   System.out.println("strings are not anagam");*/
       
       
     String st=Utility.getString();
     boolean r=Utility.isPanagram(st);
     if(r)
    	 System.out.println("string is panagram");
     else
    	 System.out.println("string is not panagram");
	}

}
