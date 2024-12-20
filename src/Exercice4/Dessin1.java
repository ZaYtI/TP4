package Exercice4;

import java.awt.*;

public class Dessin1 extends Canvas {
    public void update(Graphics g) {paint(g);}

    public void paint(Graphics g) {
        for(int i = 0; i < 100; i++) {
            // Couleur aléatoire
            Color randomColor = new Color(
                    (float)Math.random(),
                    (float)Math.random(),
                    (float)Math.random()
            );
            g.setColor(randomColor);

            // Position et taille aléatoires
            int x = (int)(Math.random() * getSize().width);
            int y = (int)(Math.random() * getSize().height);
            int width = (int)(Math.random() * 100);
            int height = (int)(Math.random() * 100);

            // 50% de chance d'avoir un rectangle ou un cercle
            if(Math.random() < 0.5) {
                g.fillRect(x, y, width, height);
            } else {
                g.fillOval(x, y, width, height);
            }
        }
    }
}