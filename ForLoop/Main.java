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
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        
        for(int i = 0; i < 10; ++i) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
    }
    
    public static double calculateInterest(double amount, double interestRate) {
            return(amount * (interestRate/100));
        }
    
}
