package SY2;

import java.util.LinkedList;
import java.util.Scanner;

public class Semlab2Application {

    private static final CooperativeCompany cooperativeCompany =
            new CooperativeCompany("Cooperative Bank", 1000000, "Location A", new LinkedList<>());
    private static final CommercialCompany commercialCompany =
            new CommercialCompany("Commercial Bank", 2000000, "Location B", new LinkedList<>());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        displayInstructions();

        boolean running = true;
        while (running) {

            System.out.print("Enter the type of company (coop for Cooperative, comm for Commercial): ");
            String companyTypeChoice = scanner.next();
            CompanyType companyType = getCompanyType(companyTypeChoice);
            if (companyType == null) {
                System.out.println("Invalid company type. Please try again.");
                continue;
            }

            int choiceOfOptions = getChoiceOfOptions(scanner, companyType);

            switch (choiceOfOptions) {
                case 1:
                    addCustomer(companyType, scanner);
                    break;
                case 2:
                    withdrawFunds(companyType, scanner);
                    break;
                case 3:
                    transferFunds(companyType, scanner);
                    break;
                case 4:
                    displayCustomers(companyType);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static int getChoiceOfOptions(Scanner scanner, CompanyType companyType) {
        System.out.println("Selected Company Type: " + companyType.getValue());
        System.out.println("1. Add Customer (" + companyType.getValue() + ")");
        System.out.println("2. Withdraw (" + companyType.getValue() + ")");
        System.out.println("3. Transfer (" + companyType.getValue() + ")");
        System.out.println("4. Display Customers (" + companyType.getValue() + ")");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private static CompanyType getCompanyType(String companyTypeChoice) {
        if (companyTypeChoice.equalsIgnoreCase("coop")) {
            return CompanyType.COOPERATIVE;
        } else if (companyTypeChoice.equalsIgnoreCase("comm")) {
            return CompanyType.COMMERCIAL;
        } else {
            System.out.println("Invalid company type.");
            return null;
        }
    }

    private static void displayInstructions() {
        System.out.println("Welcome to the Bank Management System");
    }

    private static void addCustomer(CompanyType companyType, Scanner scanner) {
        System.out.print("Enter customer name: ");
        String name = scanner.next();

        System.out.print("Enter customer ID number: ");
        String idNumber = scanner.next();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter credit limit: ");
        double creditLimit = scanner.nextDouble();

        if (companyType == CompanyType.COOPERATIVE) {
            cooperativeCompany.addCustomer(name, idNumber, balance, creditLimit);
            System.out.println("Customer added successfully to Cooperative Company.");
        } else {
            commercialCompany.addCustomer(name, idNumber, balance, creditLimit);
            System.out.println("Customer added successfully to Commercial Company.");
        }
    }

    private static void withdrawFunds(CompanyType companyType, Scanner scanner) {
        System.out.print("Enter customer ID number for withdrawal: ");
        String idNumber = scanner.next();

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        if (companyType == CompanyType.COOPERATIVE) {
            cooperativeCompany.withdraw(idNumber, amount);
        } else {
            commercialCompany.withdraw(idNumber, amount);
        }
    }

    private static void transferFunds(CompanyType companyType, Scanner scanner) {
        System.out.print("Enter sender's ID number: ");
        String senderId = scanner.next();

        System.out.print("Enter recipient's ID number: ");
        String recipientId = scanner.next();

        System.out.print("Enter transfer amount: ");
        double amount = scanner.nextDouble();

        Bank company = (companyType == CompanyType.COOPERATIVE) ? cooperativeCompany : commercialCompany;

        boolean transferSuccessful = company.transfer(senderId, recipientId, amount);
        if (transferSuccessful) {
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed. Please check the details and try again.");
        }
    }

    private static void displayCustomers(CompanyType companyType) {
        if (companyType == CompanyType.COOPERATIVE) {
            cooperativeCompany.displayCustomers();
        } else {
            commercialCompany.displayCustomers();
        }
    }
}
