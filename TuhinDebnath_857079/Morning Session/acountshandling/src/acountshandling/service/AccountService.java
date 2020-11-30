package acountshandling.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AccountService {

	public static void main(String args[]) throws java.io.IOException {
		int choice;
		int acctNo = 1;
		List<AccountsModel> accountsInfo = new ArrayList<AccountsModel>();
		AccountsModel mod = new AccountsModel();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n\n-------Choices ------------");
			System.out.println("  1. Add an account: ");
			System.out.println("  2. Remove an account: ");
			System.out.println("  3. Display an account: ");
			System.out.println("  4. Display all accounts: ");
			System.out.println("  5. Exit the program...\n");
			System.out.println("Choose one:");
			choice = sc.nextInt();

			System.out.println("");

			switch (choice) {
			case 1:
				System.out.println("Adding an account ");
				System.out.println("Enter the name: ");
				String name = sc.next();
				System.out.println("Enter the balance: ");
				double balance = sc.nextDouble();

				accountsInfo.add(new AccountsModel(acctNo, name, balance));
				acctNo++;
				break;
				
			case 2:
				System.out.println("Removing an account: ");
				int flag1=0;
				System.out.println("enter Account No.: ");
				int accountNo1 = sc.nextInt();
				for (AccountsModel user : accountsInfo) {
					if (user.getAccountNumber() == accountNo1) {
						flag1=1;
				}}
				try {
					if(flag1==0)
						throw new NumberNotFoundException("No such account found. Deletion did not occur.");
					else {
				Iterator<AccountsModel> itr = accountsInfo.iterator();
				while (itr.hasNext()) {
					AccountsModel a = itr.next();
					if (a.getAccountNumber() == accountNo1) 
						itr.remove();
				}
				System.out.println("Account removed");
					}
				}
				catch(Exception e) {
					System.out.println("Exception occured: "+e);
				}
				break;

			case 3:
				System.out.println("Enter the account number of the account to be displayed: ");
				int displayAcct = sc.nextInt();
				int flag=0;
				try {
				for (AccountsModel user : accountsInfo) {
					if (user.getAccountNumber() == displayAcct) {
						flag=1;
						System.out.println("Account No: " + user.getAccountNumber() + " Name: " + user.getName()
								+ " Balance: " + user.getBalance());
				}}
					
				 if(flag==0) {
				
					throw new NumberNotFoundException("No such account found to be displayed");
				 }
				}
				catch(Exception e) {
					System.out.println("Exception occured: "+e);
				}
				break;
			case 4:
				for (AccountsModel user : accountsInfo) {
					System.out.println("Account No: " + user.getAccountNumber() + " Name: " + user.getName()
							+ " Balance: " + user.getBalance());
					System.out.println();
				}
				break;
			case 5:
				System.out.println("------------Exiting the progam-----------");
				System.exit(0);
				break;
			case 6:
				return;

			
		}

	}
	}
}
