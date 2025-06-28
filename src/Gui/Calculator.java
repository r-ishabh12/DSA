package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(1000, 1200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // 1Input
        JLabel label1 = new JLabel("First number");
        label1.setBounds(30,30,100,25);
        frame.add(label1);

        JTextField  text1 = new JTextField();
        text1.setBounds(150,30,200,25);
        frame.add(text1);

        //2Input
        JLabel label2 = new JLabel("Second number");
        label2.setBounds(30,70,120,25);
        frame.add(label2);

        JTextField text2 = new JTextField();
        text2.setBounds(150,70,200,25);
        frame.add(text2);

        // Button
        JButton addButton =new JButton("Add");
        addButton.setBounds(20,110,60,30);
        frame.add(addButton);

        // Button
        JButton subButton =new JButton("Sub");
        subButton.setBounds(80,110,60,30);
        frame.add(subButton);

        // Button
        JButton mulButton =new JButton("mul");
        mulButton.setBounds(140,110,60,30);
        frame.add(mulButton);

        // Button
        JButton divButton =new JButton("div");
        divButton.setBounds(200,110,60,30);
        frame.add(divButton);

        // AddResult label
        JLabel Result = new JLabel("Result: ");
        Result.setBounds(30,160,300,25);
        frame.add(Result);

        //Action
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int sum = num1 + num2;
                    Result.setText("Result: " + sum);
                }catch(NumberFormatException xe ){
                    Result.setText("Enter valid numbers");
                }
            }
        });

        //Action
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int sub = num1 - num2;
                    Result.setText("Result: " + sub);
                }catch (NumberFormatException ex){
                    Result.setText("The value os not right");
                }
            }
        });

        //Action
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int mul = num1 * num2;
                    Result.setText("Result: " + mul);
                }catch(NumberFormatException xe){
                    Result.setText("Eneter valid number");
                }
            }
        });

        //Action
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    float div = num1 / num2;
                    Result.setText("Result : "+ div);
                }catch (NumberFormatException ce){
                    Result.setText("Enter valid number");
                }
            }
        });

        frame.setVisible(true);
    }
}
