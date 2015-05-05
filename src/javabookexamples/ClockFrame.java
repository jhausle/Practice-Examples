
package javabookexamples;
import java.awt.*;
import javax.swing.*;

public class ClockFrame extends JFrame{
    public ClockFrame(){
        super("Clock");
        setLookAndFeel();
        setSize(225,125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        ClockPanel time = new ClockPanel();
        add(time);
        secondFrame second = new secondFrame();
        setVisible(true);
        second.setVisible(true);
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
        ClockFrame clock = new ClockFrame();
    }
}

class secondFrame extends JFrame{
    secondFrame(){
        super("Second Frame");
        setSize(100,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
