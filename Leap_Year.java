package firstproject;

import java.util.Scanner;
class Leap_Year
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Year:");
      int years = sc.nextInt();
      if(years%400==0)
      {
    	  if(years%100==0)
    	  {
    		  if(years%4==0)
    		  {
    			  System.out.println(years+" is a Leap Year");
    		  }
    	  }
      }
      
      else
      {
    	  System.out.println(years+" is not a Leap Year");
      }
      sc.close();
    }
}

     
     
     
     
