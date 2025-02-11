package SY2;

import java.util.LinkedList;

public class CommercialCompany extends Bank{
    public CommercialCompany(String name, double capital, String location, LinkedList<Customer> customers){
        super(name, capital, location, customers);
    }

    @Override
    public void addCustomer(String name, String idNumber, double balance, double creditLimit){
        customers.add(new Customer(name, idNumber, balance, creditLimit));
    }

    @Override
    public void withdraw(String idNumber, double amount) {
        for (Customer customer : customers) {
            if (customer.getIdNumber().equals(idNumber)) {
                if (customer.getBalance() >= amount) {
                    customer.setBalance(customer.getBalance() - amount);
                    System.out.println("Withdraw successful!");
                    return;
                } else {
                    System.out.println("Insufficient balance!");
                    return;
                }
            }
        }
        System.out.println("Customer not found!");
    }

    @Override
    public boolean transfer(String senderIdNumber, String receiverIdNumber, double amount) {
        Customer sender = null;
        Customer receiver = null;

        for (Customer customer : customers) {
            if (customer.getIdNumber().equals(senderIdNumber)) {
                sender = customer;
            }
            if (customer.getIdNumber().equals(receiverIdNumber)) {
                receiver = customer;
            }
        }

    if(sender != null && receiver != null) {
        if (sender.getBalance() >= amount) {
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);
            System.out.println("Withdraw successful!");
            return true;
        } else {
            System.out.println("Insufficient balance!");
            return false;
        }
    }
    else{
        System.out.println(("Sender or receiver not found!"));
        return false;
        }
    }
}
