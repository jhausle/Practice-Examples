package javabookexamples;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author John
 */
public class SalutonApplet extends javax.swing.JApplet {
    String greeting;
    
    public void init() {
        greeting = "Saluton Applet";
    }

    public void paint(Graphics screen) {
        Graphics2D screen2D = (Graphics2D) screen;
        screen2D.drawString(greeting, 50, 50);
        // display statements go here
    }

}
