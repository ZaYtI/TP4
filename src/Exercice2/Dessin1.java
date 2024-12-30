package Exercice2;

import java.awt.*;
import java.awt.event.*;

public class Dessin1 extends Canvas {
    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        // Code de test pour comprendre le système de coordonnées
        int t = 140;
        g.setColor(Color.RED);
        for (int i = 0; i <= t; i += 5) {
            g.drawLine(100, 100 + i, 100 + i, 100 + t);
        }

        // Pour mieux visualiser les points de référence
        g.setColor(Color.BLUE);
        g.fillOval(0, 0, 5, 5);  // Point en (0,0)
        g.fillOval(100, 100, 5, 5);  // Point en (100,100)
    }
}