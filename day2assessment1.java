package Day2;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

public class day2assessment1 {

	public static void main(String[] args) {
		int pnum = 101, reverse = 0;
		while(pnum!=0) {
			int reminder = pnum%10;
			reverse = reverse*10 + reminder;
			pnum = pnum/10;
					}
		System.out.println("The reverse of the given number:" + reverse);
		if(pnum==reverse) {
			System.out.println("It's a palindrome");
					}
		else {
			System.out.println("It's not a palindrome");
			
		}
	}

}
