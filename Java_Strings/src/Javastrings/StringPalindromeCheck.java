package Javastrings;
import java.util.Scanner;
import java.io.*;
public class StringPalindromeCheck {

	public static void main(String[] args) {    
		        Scanner sc=new Scanner(System.in);
		        String A=sc.next();
		       String temp="";
		       System.out.println(A.length());
		       //copying the string A into temporary string temp
		       for(int i=A.length()-1;i>=0;i--)
		       {
		           temp=temp+A.charAt(i);
		       }
		       //printing the temporary string
		        System.out.println(temp);
		 //checking if the strings are equal using equals()   
	if(temp.equals(A)){
		
	
	System.out.println("Palindrome");}
	
	else
		System.out.println("Not Palindrome");	

	}
}

