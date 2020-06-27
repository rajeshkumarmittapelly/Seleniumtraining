package week3.Assignment;

import java.util.*;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Paypal India";
		char[] chr = str.toCharArray();
		
		Set<Character> charSet  = new LinkedHashSet<Character>();
		Set<Character> dupCharSet  = new LinkedHashSet<Character>(charSet );
		
		
		for (int i = 0; i < chr.length; i++) {
			boolean flag=charSet.add(chr[i]);
			if (!flag) {
				dupCharSet .add(chr[i]);
			}
			
		}
		
		System.out.println(charSet );
		
		System.out.println(dupCharSet );
		charSet.removeAll(dupCharSet);
		//"The Character Set after removing Duplicates :"+
		System.out.println(charSet);
		//Printing without spaces
		for (Character character : charSet) {
			if (character!=' ') {
				System.out.print(character+",");
			}
			
		}
	

	}

}
