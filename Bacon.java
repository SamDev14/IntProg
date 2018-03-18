/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorderingsystemnetbeans;

import java.awt.Color;

/**
 *
 * @author UP877426
 */
public class Bacon {
    public void drawBacon() {
        for (int i = 0; i < 30; i += 6) {

            if (i % 12 != 0) {
                canvas.setForegroundColor(Color.PINK);
            } else {
                canvas.setForegroundColor(Color.RED);
            }
            canvas.fillRectangle(topLeftX + 150, topLeftY + 150, 30 - i, 30);
        }
    }
}
