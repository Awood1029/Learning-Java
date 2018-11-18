/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Arthur Wood
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car ford = new Car();
        Car bmw = new Car();
        ford.setModel("Mustang");
        System.out.println(ford.getModel());
    }
    
}
