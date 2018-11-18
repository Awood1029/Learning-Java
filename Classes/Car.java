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
public class Car {
    
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("mustang")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    
    public String getModel() {
        return model;
    }
    
}
