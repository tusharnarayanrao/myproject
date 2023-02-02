package multiplication_without_using_operator;

import java.util.Scanner;

public class Armstrong_number
{
	
	/***
	 * logic 1st
	 * find the remainder of num
	 * int rem = num % 10 ;
	 * 
	 * logic 2nd
	 * Remove the last digit 
	 * num = num /10 ;
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
	
	
	Scanner sc = new  Scanner (System.in);
	System.out.println("Enter number : -");
	        //153
      int num = sc.nextInt() ;
                   
      int sum = 0 ;
                       //153            15 =  153/10 =15.3  we cant store decimal value in integer variable
            //                             1=15/10 = 1.5
      for(int i = num ; i>0 ; i=i/10)
      {                  //153%10=3
    	                // 15%10=5
    	               //1%10 = 1
    	  int rem= i%10 ;
    	    //27 =             ( 3*3*3)
    	  //125=      27  +  ( 5*5*5)
    	  //153 =     152+  (1*1*1)
    	  sum = sum+ (rem*rem*rem);
      }
           //153==153
      if (sum== num)
      {
    	  System.out.println("given number is armstong ");
    	  
      }
      
      else
      {
    	  System.out.println("given number is not armstrong");
      }
    		  
      
}
}