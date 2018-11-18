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
        int value = 1;
        if (value == 1) {
            System.out.println("1");
        }
        
        int switchValue = 4;
        switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Was 3, 4, or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
    }
    
}
