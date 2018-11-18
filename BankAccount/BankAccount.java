/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur Wood
 */
public class BankAccount {
    
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;
    
    public void setAccountNumber(String account) {
        this.accountNumber = account;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("You deposited $" + deposit + ". Your balance is currently: $" + this.balance);
    }
    
    public void withdraw(double withdraw) {
        if (this.balance > withdraw) {
            this.balance -= withdraw;
            System.out.println("You took out $" + withdraw + ". Your balance is currently: $" + this.balance);
        } else {
            System.out.println("You do not have enough funds. Your balance is currently: " + this.balance);
        }
        
    }
    
}
