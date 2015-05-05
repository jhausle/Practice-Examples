package javabookexamples;

import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame{
    public Playback(){
        super("Playback");
        setLookandFeel();
        setSize(250,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        JLabel pageLabel = new JLabel("Web page address: ", JLabel.RIGHT);
        JTextField pageAddress = new JTextField(20);
        add(play);
        add(stop);
        add(pause);
        add(pageLabel);
        add(pageAddress);
        setVisible(true);

    }
    
    private void setLookandFeel(){
        try{
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );    
        } catch(Exception exc) {
            //ignore error
        }
    }
    
    public static void main(String[] args){
        Playback pb = new Playback();
    }
    
}
