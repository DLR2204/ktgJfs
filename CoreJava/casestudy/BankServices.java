package casestudy;

import java.util.HashMap;
import java.util.Scanner;

public class BankServices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HashMap<Long, Account> accounts = new HashMap<Long, Account>();

		String accHolderName;

		Long contactNo;

		Long accNo;

		String typeOfAccount;

		float balance = 0;

		Account account;
		boolean value = true;

		while (value) {
			System.out.println("Welcome to banking services");
			System.out.println("---------------------------");

			System.out.println("1.Create an account");
			System.out.println("2.Balance check");
			System.out.println("3.Check account details");
			System.out.println("4.Deposit");
			System.out.println("5.Withdraw");
			System.out.println("6.FundTransfer");
			System.out.println("7.Bank Statement \n");

			System.out.print("Please select your option:-");
			byte option = scan.nextByte();
			System.out.println();

			switch (option) {
			case 1: {
				System.out.println("Create an account");

				System.out.print("Please enter your name:-");
				accHolderName = scan.next();

				System.out.print("Please enter your contact number:-");
				contactNo = scan.nextLong();

				System.out.print("Please enter your type of account:-");
				typeOfAccount = scan.next();

				accNo = contactNo - 93874534;

				account = new Account(accHolderName, contactNo, accNo, typeOfAccount, balance);

				accounts.put(accNo, account);

				System.out.println("Your account is created successfully");
				System.out.println("Your account number is :-" + accNo);
				System.out.println("                           ------------");

				System.out.println("\n \n \n");

				break;
			}
			case 2: {
				System.out.println("Balance Check");

				System.out.print("Please enter your account number:-");
				accNo = scan.nextLong();

				account = accounts.get(accNo);

				float AccountBalance = account.getBalance();

				System.out.println("The current balance is :-" + AccountBalance);
				System.out.println("\n \n \n");

				break;
			}
			case 3: {
				System.out.println("Check Account details");

				System.out.print("Please enter your account number:-");
				accNo = scan.nextLong();

				account = accounts.get(accNo);

				System.out.println(account);
				
				System.out.println("\n \n \n");

				break;
			}
			case 4: {
				System.out.println("Deposit");
				
				System.out.println("Please enter your account number:-");
				accNo = scan.nextLong();
				
				System.out.println("Please enter your deposit amount:-");
				float depositAmount = scan.nextFloat();
				
				account = accounts.get(accNo);

				float existingAmount = account.getBalance();
				
				float finalAmount = existingAmount + depositAmount;
				
				account.setBalance(finalAmount);
				
				System.out.println("Your amount is credited successfully");
				
				System.out.println("The current balance is:-"+finalAmount);
				
				accounts.put(accNo, account);

				
				
				break;
			}
			case 5: {
				System.out.println("Withdraw");
				break;
			}
			case 6: {
				System.out.println("Fund Transfer");
				break;
			}
			case 7: {
				System.out.println("Print Bankstatment");
				break;
			}
			default: {
				System.out.println("Thank you");
				break;
			}
			}
		}

	}
}
