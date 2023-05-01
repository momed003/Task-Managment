package model;

import java.util.Locale;
import javax.swing.JFrame;

public class Graficos extends JFrame{
    
    public Graficos(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("My tasks");
        setSize(450, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Graficos();
    }
    
}
