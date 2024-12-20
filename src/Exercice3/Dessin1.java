package Exercice3;

import java.awt.*;

public class Dessin1 extends Canvas {
    public void update(Graphics g) {paint(g);}

    public void paint(Graphics g) {
        // Carré pour la base de la maison
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 100, 100);

        // Triangle pour le toit
        int[] xPoints = {75, 150, 225};  // Points X du triangle
        int[] yPoints = {100, 25, 100};  // Points Y du triangle
        // Couleur Rouge pour le toit
        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}