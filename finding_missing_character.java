package oopsAssignment;

import java.util.Scanner;

public class ascii1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      String res="ABCDG";
      
      Scanner scn=new Scanner(System.in);
   

      System.out.println("Enter a character:");

      char start = scn.next().charAt(0);
      char end = scn.next().charAt(0);
      String res=scn.next();
      
      int sum1=0;
      int sum2=0;

      for(int i=0;i<res.length();i++) {
    	  
    	  int asciivalue=(int)res.charAt(i);
    	  sum1=sum1+asciivalue;
      }
      
		for(int i=start;i<=end;i++) {
		    	  
//		    	  
		    	  sum2=sum2+i;
		      }
		int diff=sum2-sum1;
		System.out.println((char)diff );
		
	}
	

}
