package calculator;
import java.util.*;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		float arg1 = 0;
		float arg2 = 0;
		float answer;
		char choice;
		Scanner inp = new Scanner(System.in);
		choice = '0';
		boolean isInvalid = false;
		
		while (choice != '5') {
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\nEnter Your Choice: ");
			choice = inp.next().charAt(0);
			if (choice == '1') {
				do {
					isInvalid = false;
					try {
						System.out.println("Type first number and press Enter: ");
						arg1 = Float.parseFloat(inp.next());
						System.out.println("Type second number and press Enter: ");
						arg2 = Float.parseFloat(inp.next());
					} catch (NumberFormatException e) {
						System.out.println("Please enter valid input.");
						isInvalid = true;
					}
				} while (isInvalid == true);
				answer = arg1 + arg2;
				System.out.println("Answer is: " + answer);
			} 
			
			else if (choice == '2') {
				do {
					isInvalid = false;
					try {
						System.out.println("Format: number1 - number2\nType first number and press Enter : ");
						arg1 = Float.parseFloat(inp.next());
						System.out.println("Type second number and press Enter: ");
						arg2 = Float.parseFloat(inp.next());
					} catch (NumberFormatException e) {
						System.out.println("Please enter valid input.");
						isInvalid = true;
					}
				} while (isInvalid == true);
				answer = arg1 - arg2;
				System.out.println("Answer is: " + answer);
			} 
			
			else if (choice == '3') {
				do {
					isInvalid = false;
					try {
						System.out.println("Type first number and press Enter : ");
						arg1 = Float.parseFloat(inp.next());
						System.out.println("Type second number and press Enter: ");
						arg2 = Float.parseFloat(inp.next());
					} catch (NumberFormatException e) {
						System.out.println("Please enter valid input.");
						isInvalid = true;
					}
				} while (isInvalid == true);
				answer = arg1 * arg2;
				System.out.println("Answer is: " + answer);
			}
			
			else if (choice == '4') {
				do {
					isInvalid = false;
					try {
						System.out.println("Format: number1 / number2\nType first number and press Enter : ");
						arg1 = Float.parseFloat(inp.next());
						System.out.println("Type second number and press Enter: ");
						arg2 = Float.parseFloat(inp.next());
						while (arg2 == 0) {
							System.out.println("Cannot divide by 0. Please enter a valid second number: ");
							arg2 = Float.parseFloat(inp.next());
						}
					} catch (NumberFormatException e) {
						System.out.println("Please enter valid input.");
						isInvalid = true;
					}
				} while (isInvalid == true);
				answer = arg1 / arg2;
				System.out.println("Answer is: " + answer);
			}
			
			else if (choice == '5') {
				System.out.println("program closed");
			}
			else {
				System.out.println("invalid input");
			}
			
		}
		inp.close();		
	}		
}
