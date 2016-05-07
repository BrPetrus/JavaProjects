package book.Fibonacci;
import java.util.Scanner;

public class ComputeFibonacci {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		//Ask for index
		System.out.print("Enter an index for fibonacci number: ");
		int index = keyboardInput.nextInt();
		
		//Find and display
		System.out.println("The fibonacci number at index " + index + " is " + fib(index));
	}
	
	public static long fib(long index) {
		if (index == 0) //Base case
			return 0;
		else if (index == 1) //Base case
			return 1;
		else //Recursive calls
			return fib(index - 1) + fib(index - 2);
	}
}