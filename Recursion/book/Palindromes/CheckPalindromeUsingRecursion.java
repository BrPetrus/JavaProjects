package book.Palindromes;
import java.util.Scanner;

public class CheckPalindromeUsingRecursion {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter palindrome: ");
		String input = keyboardInput.next();
		if (isPalindrome(input))
			System.out.println("\"" + input + "\" is a palindrome.");
		else
			System.out.println("\"" + input + "\" is not a palindrome.");
	}
	
	public static boolean isPalindrome(String text) {
		if (text.length() <= 1) 
			return true;
		else if(text.charAt(0) != text.charAt(text.length() - 1))
			return false;
		else 
			return isPalindrome(text.substring(1, text.length() - 1));
	}
}
