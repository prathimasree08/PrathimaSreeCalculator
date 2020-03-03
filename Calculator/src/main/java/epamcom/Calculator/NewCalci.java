package epamcom.Calculator;
import java.util.Scanner;

public class NewCalci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Operations mp = new Operations();
		System.out.println("Enter numbers to perform operations");
		double n1 = sc.nextInt();
		double n2 = sc.nextInt();
		System.out.println("Select the operation --> +,-,*,/");
		System.out.println("1 for Addition" + "\n" +" 2 for Substraction" + "\n" + " 3 for Multiplication" + "\n" + " 4 for Division");
		int option = sc.nextInt();
		switch(option){
		case 1:
			System.out.println("Answer is : " + mp.add(n1, n2));
			break;
		case 2:
			System.out.println("Answer is : " + mp.substract(n1, n2));
			break;
		case 3:
			System.out.println("Answer is : " + mp.multiply(n1, n2));
			break;
		case 4:
			System.out.println("Answer is : " + mp.divide(n1, n2));
			break;
		default:
			System.out.println("Invalid option entered");
			
		}
	}


}
