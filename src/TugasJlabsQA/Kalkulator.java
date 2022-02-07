package TugasJlabsQA;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {
	public static void main(String[] args) throws Exception  {
		Scanner sc = new Scanner(System.in);

		try {
			double firstNumber, secondNumber;
			int choice;

			System.out.println("Welcome to Calculator");
			System.out.println("Option:");
			System.out.println("(1) Addition");
			System.out.println("(2) Subtraction");
			System.out.println("(3) Multiplication");
			System.out.println("(4) Division");
			System.out.println("(5) Exit Calculator");
			System.out.println();
			while (true) //loop to run the calculator continuously
			{
			System.out.print("Enter Your Choice: ");
			choice = sc.nextInt();

			if (choice >= 1 && choice <=4) {
				System.out.print("Enter First Number: ");
				firstNumber = sc.nextDouble();
				System.out.print("Enter Second Number: ");
				secondNumber = sc.nextDouble();

				switch (choice) {
				case 1:
					tambah(firstNumber, secondNumber);
					break;
				case 2:
					kurang(firstNumber, secondNumber);
					break;
				case 3:
					kali(firstNumber, secondNumber);
					break;
				case 4:
					bagi(firstNumber, secondNumber);
					break;
				}
			} else if (choice == 5) {
				System.out.println("Thank you for using the calculator.");
				System.exit(5); 
			}
			else {
				System.out.println("You have entered wrong choice");
			}
			System.out.println();
		}
	} catch (InputMismatchException e) {
			e.printStackTrace();
			throw new Exception("This is an error because this thing is not number");
		}
	}

	
	public static void tambah(double firstNumber, double secondNumber) {
		double answer = firstNumber + secondNumber;
		System.out.println("Hasil Penjumlahan Kedua Angka adalah "+answer);
	}
	public static void kurang(double firstNumber, double secondNumber) {
		double answer = firstNumber - secondNumber;
		System.out.println("Result: "+answer);
	}
	public static void kali(double firstNumber, double secondNumber) {
		double answer = firstNumber * secondNumber;
		System.out.println("Result: "+answer);
	}
	public static void bagi (double firstNumber,double secondNumber) {
		double answer = firstNumber / secondNumber;
		System.out.println("Result: "+answer);
	}
}
