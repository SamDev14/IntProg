/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorderingsystemnetbeans;

import java.awt.Color;

/**
 *
 * @author sam
 */
public class Toppings {
    protected String name;
    protected Color primary;
    protected Color secondary;
    protected double price;
    
    public Toppings(String tName, Color cPrimary, Color cSecondary, double toppingPrice) {
        name = tName;
        primary = cPrimary;
        secondary = cSecondary;
        price = toppingPrice;
    }
    
    public getPrice() {
        return price;
    }
    
    public void toppingLayout() {
        
    }
}
