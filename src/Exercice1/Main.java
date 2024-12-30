package Exercice1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame(); // Créer une fenêtre
        f.setBounds(0, 0, 500, 500); // Lui donner une dimension
        f.add(new Dessin1()); //Mettre le programme de dessin
        //Faire fonctionner la « croix » pour quitter l’application
        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent ev) { System.exit(0);
            }
        });
        f.show();// Montrer le tout
    }
}