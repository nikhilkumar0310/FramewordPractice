package mavenLearning;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Sring to be Tested");
		String s = sc.next();
		
		String rev = "";
		int len = s.length();
		
		for(int i=len-1; i>=0; i--) {
			
			rev = rev + s.charAt(i);
		}
		
		System.out.println("This is the String after reversal "+rev);
		
		if (rev.equalsIgnoreCase(s)) {
			
			System.out.println("The String is Palindrome");
		}else
			System.out.println("Not a Palindrome");
		
		
		StringBuffer sb = new StringBuffer("Dyum");
		
		System.out.println(sb.reverse());
	}

}
