/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorderingsystemnetbeans;

/**
 *
 * @author UP877426
 */
public class PizzaInputs {
    KeyboardInput input = new KeyboardInput();
    
    
    public String getSize() {
        String size;
        System.out.println("What size would you like? small, medium or large."
                + "\nSmall(10\") Medium(12\") Large(14\"): ");
        size = input.getInputString();
        
        while(!("Small".equals(size) || "Medium".equals(size) || "Large".equals(size))) {
            System.out.println("Wrong size entered, please try again.");
            System.out.println("What size would you like? Please enter Small, Medium or Large."
                    + "\nSmall(10\") Medium(12\") Large(14\"): ");
            size = input.getInputString();
        }
        return size;
    }
    
    public boolean getBase() {
        System.out.println("Would you like to change the sauce to BBQ?"
                + "\nIf yes, please enter BBQ. Otherwise please enter any key to continue: ");
        input.getInputString();
        
        if("BBQ".equals(input)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getPan() {
        String pan;
        System.out.println("What style of pizza would you like? Deep pan, Thin crust or Stuffed crust");
        pan = input.getInputString();
        
        while(!("Deep pan".equals(pan) || "Thin crust".equals(pan) || "Stuffed crust".equals(pan))) {
            System.out.println("You have entered an invalid pan option, please try again.");
            System.out.println("What style of pizza would you like? Please enter Deep pan, Thin crust or Stuffed crust");
            pan = input.getInputString();
        }
        return pan;
    }
    
    public int numOfToppings() {
        int toppingNumber;
        System.out.println("How many toppings would you like? Please enter 1 or 2: ");
        toppingNumber = input.getInputInteger();
        
        while(toppingNumber < 0 || toppingNumber > 2) {
            if(toppingNumber == 1) {
                return 1;
            } else if(toppingNumber == 2) {
                return 2;
            } else {
                System.out.println("You have entered an invalid amount, please try again.");
                System.out.println("How many toppings would you like? Please enter 1 or 2: ");
                toppingNumber = input.getInputInteger();
            }
        }
    }
    
    
}
