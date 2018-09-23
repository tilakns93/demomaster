package palindromeTest;

import java.util.*;


public class TestPalindrome {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the input string:");
		String reverse = "";
		Scanner input = new Scanner(System.in);
		String original = input.nextLine();
		
		for(int i=original.length()-1;i>=0;i--) {
			reverse = reverse+original.charAt(i);
		}
		
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("Entered string is a Palindrome");
		}
		else {
			System.out.println("Entered string is not a Palindrome");
		}
		
	}

}
