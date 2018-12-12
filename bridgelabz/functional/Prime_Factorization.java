package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Prime_Factorization 
{

	public static void main(String[] args) 
	{    
		int n=Utility.getInt();
		primeFactors(n);
		
	}
          public static void primeFactors(int n)
          {
        	   while(n%2==0)
        	   {
        		   System.out.print(2+" ");
        		   n/=2;
        	   }
        	   for (int i = 3; i <=Math.sqrt(n); i+=2)
        	   {
        		   while(n%i==0)
        		   {
        			   System.out.print(i+" ");
        			   n/=i;
        		   }
               }
        	   if(n>2)
        		   System.out.print(n);
          }
	

}
