package Exercice1;

import java.awt.*;

public class Dessin1 extends Canvas {
    public void update(Graphics g) {paint(g);}
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0,0, 100, 100);
        g.setColor(Color.GREEN);
        g.drawString("Coucou (vert+rouge=jaune)", 10, 60);
        System.out.println("coucou");
    }
}