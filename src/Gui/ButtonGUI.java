package Gui;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonGUI {
    public static void main(String[] args) {
        //Step 1. to create a frame
        JFrame frame = new JFrame("Button Click");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //Step 2. to create the label
        JLabel label = new JLabel("Click the buttons!");
        label.setBounds(50, 30 ,300, 30);
        frame.add(label);

        //Step3 . to create a button
        JButton Button = new JButton("Click me!");
        Button.setBounds(50,80,120,30);
        frame.add(Button);

        //Step4. Add An Action event to the button
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("You clicked the button!");
            }
        });

        //Step 5. To make the frame visible
        frame.setVisible(true);
    }
}
