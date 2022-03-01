package Javastrings;

import java.util.Scanner;

public class SubstringPrintFromGivenIndex {

	
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //reading a string
        String S = in.next();
        //getting starting index
        int start = in.nextInt();
        //reading end index value
        int end = in.nextInt();
        
        //code with no use of substring()
        
      // char[] mychar= S.toCharArray();
       //for( int i=start;i<end;i++)
      // {
    	//  System.out.println(mychar[i]) ;
      // }
       
        
        //using substring()
      String mystring =S.substring(start,end-1);
       System.out.println(mystring);
       
        
    }
}
