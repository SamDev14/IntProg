package pizzaorderingsystemnetbeans;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Class to represent a single pizza.
 *
 * @author UP877426
 */
public class Pizza {

    private Canvas canvas;
    private double topLeftX;
    private double topLeftY;

    /**
     * Constructor for pizza.
     *
     * @param win the window to draw the pizza on
     * @param startX the top-left x coordinate for the section of screen to draw
     * pizza on
     * @param startY the top-left y coordinate for the section of screen to draw
     * pizza on
     */
    public Pizza(Canvas win, double startX, double startY) {
        canvas = win;
        topLeftX = startX;
        topLeftY = startY;

    }

    /**
     * Method to display the pizza information on the screen.
     */
    public void displayPizza() {
        drawPizza();
        drawTopLine();
        drawBottomLine();
        drawBacon();
        drawPepper();
    }

    /**
     * Method to display the pizza on the screen.
     */
    private void drawPizza() {
        canvas.setForegroundColor(Color.YELLOW);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 200);
        
        if(true) {
            canvas.setForegroundColor(Color.RED);
        } else {
            canvas.setForegroundColor(Color.ORANGE);
        }
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 180);
        
        canvas.setForegroundColor(Color.WHITE);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 160);
    }

    /**
     * Method to write the information shown in the bottom line of the
     * individual pizza on the screen. This method will display the pizza number
     * and size at the top of the screen (once completed)
     */
    private void drawTopLine() {
        String topLine = "Pizza";

        double stringX = topLeftX + 10;
        double stringY = topLeftY + 25;

        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(topLine, stringX, stringY);
    }

    /**
     * Method to write the information shown in the bottom line of the
     * individual pizza on the screen. This method will display the type of
     * crust and sauce ordered (once completed)
     */
    private void drawBottomLine() {
        String bottomLine = "Crust: ";

        double stringX = topLeftX + 10;
        double stringY = topLeftY + 290;

        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(bottomLine, stringX, stringY);
    }

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
