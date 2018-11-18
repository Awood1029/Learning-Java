/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur Wood
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.setName("Arthur Wood");
        bank.setAccountNumber("1912");
        bank.setEmail("cwarthur1029@gmail.com");
        bank.setPhoneNumber("5408941160");
        bank.setBalance(1200.00);
        
        System.out.println(bank.getBalance());
        bank.deposit(589.50);
        System.out.println(bank.getBalance());

        bank.withdraw(302.23);
        System.out.println(bank.getBalance());

    }
    
}
