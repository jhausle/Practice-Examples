/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabookexamples;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author John
 */
public class SalutonFrame extends JFrame{
    public SalutonFrame(){
        super("Saluton mondo!");
        setLookAndFeel();
        setSize(350,100);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel saluton = new JLabel("Saluton mondo!");
        add(saluton);
        setVisible(true);
        
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );    
        } catch(Exception exc) {
            //ignore error
        }
    }
    public static void main(String[] args){
        SalutonFrame sal = new SalutonFrame();
    }
}
