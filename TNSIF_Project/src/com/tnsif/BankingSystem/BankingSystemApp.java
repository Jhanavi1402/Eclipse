package com.tnsif.BankingSystem;

import java.util.*;

public class BankingSystemApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankingService service = new BankingServiceImpl();

        while (true) {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by Id");
            System.out.println("6. List all Accounts of a Customer");
            System.out.println("7. List all Transactions of an Account");
            System.out.println("8. List all Beneficiaries of a Customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();
                    service.addCustomer(new Customer(cid, name, address, contact));
                    System.out.println("Customer added.");
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    int aid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int custId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Account Type: ");
                    String type = sc.nextLine();
                    System.out.print("Balance: ");
                    double bal = sc.nextDouble();
                    sc.nextLine();
                    service.addAccount(new Account(aid, custId, type, bal));
                    System.out.println("Account added.");
                    break;

                case 3:
                    System.out.print("Enter Beneficiary ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int bcid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String bname = sc.nextLine();
                    System.out.print("Account Number: ");
                    String accNo = sc.nextLine();
                    System.out.print("Bank Details: ");
                    String bank = sc.nextLine();
                    service.addBeneficiary(new Beneficiary(bid, bcid, bname, accNo, bank));
                    System.out.println("Beneficiary added.");
                    break;

                case 4:
                    System.out.print("Enter Account ID: ");
                    int transAccId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type (Deposit/Withdrawal): ");
                    String transType = sc.nextLine();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    service.addTransaction(new Transaction(transAccId, transType, amt));
                    System.out.println("Transaction added.");
                    break;

                case 5:
                    System.out.print("Enter Customer ID: ");
                    int findCid = sc.nextInt();
                    sc.nextLine();
                    System.out.println(service.findCustomerById(findCid));
                    break;

                case 6:
                    System.out.print("Enter Customer ID: ");
                    int listAccCid = sc.nextInt();
                    sc.nextLine();
                    List<Account> accList = service.getAccountsByCustomerId(listAccCid);
                    accList.forEach(System.out::println);
                    break;

                case 7:
                    System.out.print("Enter Account ID: ");
                    int listTransAid = sc.nextInt();
                    sc.nextLine();
                    List<Transaction> transList = service.getTransactionsByAccountId(listTransAid);
                    transList.forEach(System.out::println);
                    break;

                case 8:
                    System.out.print("Enter Customer ID: ");
                    int listBenCid = sc.nextInt();
                    sc.nextLine();
                    List<Beneficiary> benList = service.getBeneficiariesByCustomerId(listBenCid);
                    benList.forEach(System.out::println);
                    break;

                case 9:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
