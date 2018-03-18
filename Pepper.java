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
public class Pepper {
    
    
    public void drawPepper() {
        int heightAdjust = 100;
        int diameter = 20;
        canvas.setForegroundColor(Color.ORANGE);
        for (int i = 0; i <= 1; i++) {
            for (int j = 150; j <= 160; j += 5) {
                if (j == 155) {
                    heightAdjust = 110;
                } else {
                    heightAdjust = 100;
                }
                canvas.fillCircle(topLeftX + j, topLeftY + heightAdjust, diameter);
            }
            canvas.setForegroundColor(Color.WHITE);
            diameter = 14;

        }
    }
}
