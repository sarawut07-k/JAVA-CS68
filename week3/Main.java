package week3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        BankAccount account1 = new BankAccount("001", "Sarawut", 1000.0, 1234);
        BankAccount account2 = new BankAccount("002", "Somchai", 2000.0, 1111);
        BankAccount account3 = new BankAccount("003", "Anan", 3000.0, 2222);
        BankAccount account4 = new BankAccount("004", "Suda", 4000.0, 3333);
        BankAccount account5 = new BankAccount("005", "Nida", 5000.0, 4444);

        ATM atm = null;
        

        int menu, pinCode;
        String accountNo;

        System.out.print("Enter Account Number: ");
        accountNo = sc.nextLine();

        System.out.print("Enter PIN: ");
        pinCode = sc.nextInt();

      
        if (account1.AuthAccount(accountNo, pinCode)) {
            atm = new ATM(account1);
        } else if (account2.AuthAccount(accountNo, pinCode)) {
            atm = new ATM(account2);
        } else if (account3.AuthAccount(accountNo, pinCode)) {
            atm = new ATM(account3);
        } else if (account4.AuthAccount(accountNo, pinCode)) {
            atm = new ATM(account4);
        } else if (account5.AuthAccount(accountNo, pinCode)) {
            atm = new ATM(account5);
        } else {
            System.out.println("Invalid Account Number or PIN.");
            sc.close();
            return;
        }

        do {
            System.out.println("\n==== MAIN ATM SYSTEM ====");
            System.out.println("1. Show Account Info");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Select Menu: ");

            menu = sc.nextInt();

            if (menu == 1) {
                atm.showAccountInfo();
            } else if (menu == 2) {
                System.out.print("Enter Deposit Amount: ");
                double amount = sc.nextDouble();
                atm.depositMoney(amount);
            } else if (menu == 3) {
                System.out.print("Enter Withdrawal Amount: ");
                double amount = sc.nextDouble();
                atm.withdrawMoney(amount);
            } else if (menu == 4) {
                atm.checkBalance();
            } else if (menu == 0) {
                System.out.println("Logout Successful.");
            } else {
                System.out.println("Invalid Menu.");
            }

        } while (menu != 0);

        sc.close();
    }
}