package javabookexamples;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author John
 */
public class mailWriter extends JFrame{
    JPanel row1 = new JPanel();
    JLabel to = new JLabel("To: ");
    JTextField toText = new JTextField(24);
    
    JPanel row2 = new JPanel();
    JLabel subject = new JLabel("Subject: ");
    JTextField subjText = new JTextField(24);
    
    JPanel row3 = new JPanel();
    JLabel message = new JLabel("Message: ");
    JTextArea messText = new JTextArea(4, 24);
    
    JPanel row4 = new JPanel();
    JButton send = new JButton("Send");
    JScrollPane scroll = new JScrollPane(messText, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    
    public mailWriter(){
        super("Write an E-Mail");
        setSize(370, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
        setLayout(layout);
        
        row1.add(to);
        row1.add(toText);
        add(row1);
        
        row2.add(subject);
        row2.add(subjText);
        add(row2);
        
        row3.add(message);
        //row3.add(messText);
        row3.add(scroll);
        messText.setLineWrap(true);
        messText.setWrapStyleWord(true);
        add(row3);
        
        row4.add(send);
        add(row4);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        mailWriter frame = new mailWriter();
    }
    
    
}
