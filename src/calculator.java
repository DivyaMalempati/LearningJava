import java.security.Principal;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//String operand=readOperand(scanner);
		int number1=readNumbers(scanner);
		int number2=readNumbers(scanner);
		int operation=readNumbers(scanner);
		operations(number1, number2, operation);
		
		do {
			System.out.println("Enter the Operation to be performed \n"+
					"1. Addition \n"+"2.Subtraction \n"+
					"3. Mutliply \n"+"4.Divide \n"+
					"5. Modulo \n"+"0.End \n");
					operations(number1, number2, operation);
			operation=readNumbers(scanner);
			System.out.println("Enter the numbers \n"+
			"Enter the first Number");
			number1=readNumbers(scanner);
			System.out.println("Enter the Second Number");
			number2=readNumbers(scanner);
			
		}while(operation!=0);
		scanner.close();
	}
	private static String readOperand(Scanner scanner) {
		return scanner.next();
	}
	private static void printNumbers(int number) {
		System.out.println(number);
	}
	private static int readNumbers(Scanner scanner) {
		return scanner.nextInt();
	}
	private static void operations(int number1,int number2,int operand) {
		int number;
		switch (operand) {
		case 1:
			number=number1+number2;
			printNumbers(number);
			break;
		case 2:
			if(number1>number2) {
				number=number1-number2;
				printNumbers(number);
			}
			else {
				number=number2-number1;
				printNumbers(number);
			}
			
			break;
		case 3:
			number=number1*number2;
			printNumbers(number);
			break;
		case 4:
			number=number1/number2;
			printNumbers(number);
			break;
		case 5:
			number=number1%number2;
			printNumbers(number);
			break;

		default:
			break;
		}
	}
}
