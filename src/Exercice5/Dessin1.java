package Exercice5;

import java.awt.*;

public class Dessin1 extends Canvas {
    public void update(Graphics g) {paint(g);}

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);

        // Axes
        g.drawLine(0, getSize().height/2, getSize().width, getSize().height/2);  // axe X
        g.drawLine(50, 0, 50, getSize().height);  // axe Y

        // Tracé du cosinus
        g.setColor(Color.BLUE);
        int lastX = 0;
        int lastY = getSize().height/2;

        for(int x = 0; x < getSize().width; x++) {
            // Conversion des coordonnées
            double angle = (x - 50) * 0.05;  // facteur d'échelle
            int y = (int)(getSize().height/2 - Math.cos(angle) * 100);  // *100 pour amplifier

            g.drawLine(lastX, lastY, x, y);
            lastX = x;
            lastY = y;
        }
    }
}