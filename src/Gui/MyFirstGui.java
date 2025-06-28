package Gui;

import javax.swing.*;

public class MyFirstGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI"); //this is for the corner top window name
        frame.setSize(800,400); // this is for the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // after clicking o the cross button it tells the java to stop the program

        JLabel label = new JLabel("Hello, Java GUI!"); // For wht input you have to provide
        frame.add(label); // add the label which is given above
        frame.setVisible(true); // this make window visible
    }
}
