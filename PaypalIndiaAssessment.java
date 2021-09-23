package week3day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PaypalIndiaAssessment {

	public static void main(String[] args) {
		String str = "PaypalIndia";
		char[] charArray = str.toCharArray();
		Set<Character> charSet	= new LinkedHashSet<Character>();
		Set<Character> dupCharSet	= new LinkedHashSet<Character>();
		for(int i=0; i<charArray.length;i++) {
			charSet.addAll(charSet);
		}
			System.out.println(charArray);
			
			
		
	}

}
