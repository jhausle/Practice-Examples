package javabookexamples;

import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    JPanel row1 = new JPanel();
    JPanel row2 = new JPanel();

    public Crisis() {
        super("Crisis");
        setLookAndFeel();
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(3,1,10,10);
        setLayout(layout);
        
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        panicButton = new JButton("Panic");
        dontPanicButton = new JButton("Don't Panic");
        row1.add(panicButton);
        row1.add(dontPanicButton);
        add(row1);
        
        BoxLayout layout2 = new BoxLayout(row1, BoxLayout.X_AXIS);
        blameButton = new JButton("Blame Others");
        mediaButton = new JButton("Notify the Media");
        saveButton = new JButton("Save Yourself");
        row2.add(blameButton);
        row2.add(mediaButton);
        row2.add(saveButton);
        add(row2);
        
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }

    public static void main(String[] arguments) {
        Crisis cr = new Crisis();
    }
}