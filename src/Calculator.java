import java.util.Scanner;

/**
 * 
 */

/**
 * @author M1034567
 *
 */
public class Calculator {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a , int b) {
		return a * b;
	}
	
	
	public static void main(String args[]) {
		System.out.println("Calculator Programme");
		System.out.println("**********************");
		Scanner scanner;
		do {	
			System.out.print("Enter the first multiple :");
			scanner = new Scanner(System.in);
			int firstMultiple = scanner.nextInt();
			System.out.print("Enter the second multiple :");
			int secondMultiple = scanner.nextInt();
			int result = add(firstMultiple, secondMultiple);
			System.out.printf("Result = %d", result);
			System.out.println("");
			System.out.println("******************************");
			System.out.println("Enter the option : 0 / 1 ");
			System.out.println("1 : Start");
			System.out.println("0 : Stop");
		} while (scanner.nextInt() != 0);
		System.out.println("Closing the connection !!!!!");
		scanner.close();
	}

}
