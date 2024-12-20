package Exercice2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Frame f = new Frame(); // Créer une fenêtre
        f.setBounds(0, 0, 500, 500); // Lui donner une dimension
        f.add(new Exercice2.Dessin1()); //Mettre le programme de dessin
        //Faire fonctionner la « croix » pour quitter l’application
        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent ev) { System.exit(0);
            }
        }); // Montrer le tout
        f.show();
    }
}