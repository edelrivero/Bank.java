/* CS1101 Intro to Computer Science
 *Instructor: Diego & Jacob
 *Week 4 Lab Assignment
 *Modified and submitted by:Edgar Del Rivero 
*/
import java.util.Scanner;

public class Bank {
	public static void main(String[]args)
	{
		double initialBalance = 10000; 
		double userInput = 0; //amount of $ to withdraw or deposit
		char operator; //used for our cases
		double finalBalance = 10000; 

		Scanner sc = new Scanner(System.in);

		//Welcome Message
		System.out.println("Hello Velentin Elizalde, your initial balance is $10,000. ");
		System.out.println("Are you withdrawing \"w\" or are you depositing \"d\" ?" );
		operator = sc.next().charAt(0); //user enters w or d

		System.out.println("How much will that be? ");
		System.out.print("$");
		userInput = sc.nextDouble(); //amount of money to input


			switch (operator) {
				case 'w':
						if (initialBalance < userInput) {
									System.out.println("Cannot withdraw more than the initial balance.");
								}
						else {
									finalBalance = withdraw(initialBalance,userInput); //goes to the withdraw method

								}
						break;
				case 'd':
						finalBalance = deposit(initialBalance,userInput); //goes to the deposit method
						break;
				default:
						System.out.println("Error: Please run again and enter \"w\" for withdrawing or \"d\" for depositing. ");
						break;

			}



			System.out.println("Thank you Valentin Elizalde, your final balance is $" + finalBalance);
	}
	public static double withdraw(double initialBalance, double userInput){ //operation for withdrawing
		return initialBalance - userInput;
	}
	public static double deposit(double initialBalance, double userInput){ //operation for depositing
		return initialBalance + userInput;
	}
}