package week1Day1;

import java.util.Scanner;

public class Polyndrome {
	
	static boolean isPalindrome(String str1) {
		String str2 = "";
		for (int i = str1.length()-1; i >=0 ; i--) {
				
				str2 = str2 + str1.charAt(i);
				
			}
		
		System.out.println("Revrese of given string: "+str2);
		if (str1.equals(str2)) {
			return true;
		}
		else
			
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = ""; 
		 Scanner in = new Scanner(System.in);
		 System.out.println("Please enter the string");
		 str = in.nextLine();
		 System.out.println(str);
		  
	        if (isPalindrome(str)) 
	            System.out.print("Yes"); 
	        else
	            System.out.print("No"); 

	}

}
