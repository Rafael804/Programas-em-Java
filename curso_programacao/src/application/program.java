package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Accout;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Accout accout;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if ( response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			accout = new Accout(number, holder, initialDeposit);
		}
		else {
			accout = new Accout(number,holder);
		}
		System.out.println();
		System.out.print("Account data: ");
		System.out.println(accout);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		accout.deposit(depositValue);
		System.out.print("Update account data:  ");
		System.out.print(accout);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		accout.deposit(withdrawValue);
		System.out.print("Update account data:  ");
		System.out.print(accout);
		
		sc.close();
		
	}

}
