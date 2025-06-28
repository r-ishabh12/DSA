package Gui;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SRMS {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Management System");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // name Label
        JLabel namelabel = new JLabel("Name");
        namelabel.setBounds(30,30,100,25);
        frame.add(namelabel);

        JTextField namefield = new JTextField();
        namefield.setBounds(150,30,200,25);
        frame.add(namefield);

        //roll no
        JLabel rollnolabel = new JLabel("Roll no");
        rollnolabel.setBounds(30,70,100,25);
        frame.add(rollnolabel);

        JTextField rollnofield = new JTextField();
        rollnofield.setBounds(150,70,200,25);
        frame.add(rollnofield);

        //marks
        JLabel markslabel = new JLabel("Marks");
        markslabel.setBounds(30,110,100,25);
        frame.add(markslabel);

        JTextField marksfield = new JTextField();
        marksfield.setBounds(150,110,200,25);
        frame.add(marksfield);

        // BUtton
        JButton saveButton = new JButton("Save");
        saveButton.setBounds(50,170,100,30);
        frame.add(saveButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(170,170,100,30);
        frame.add(clearButton);

        JButton ViewButton = new JButton("View");
        ViewButton.setBounds(290 ,170,100,30);
        frame.add(ViewButton);

        // Clear Button logic
        clearButton.addActionListener(e -> {
            namefield.setText("");
            rollnofield.setText("");
            marksfield.setText("");
                }
                );

        //Save Button logic
        saveButton.addActionListener(e -> {
            String name = namefield.getText();
            String rollno = rollnofield.getText();
            String marks = marksfield.getText();

            if (name.isEmpty() || rollno.isEmpty() || marks.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Please fill all the fields");
            }

            Student student = new Student(name,rollno,marks);

            try {
                FileWriter writer = new FileWriter("students.txt",true);
                writer.write(student.tofileformat() +"\n");
                writer.close();
                JOptionPane.showMessageDialog(frame,"Stdent data saved");

                //Clearing data after saved
                namefield.setText("");
                rollnofield.setText("");
                marksfield.setText("");
            }catch (IOException ex){
                JOptionPane.showMessageDialog(frame,"Error saving to file");
            }
        });

        //View Button logic
        ViewButton.addActionListener(e -> {
            JFrame viewFrame = new JFrame("Records");
            viewFrame.setSize(400,400);
            viewFrame.setLayout(null);

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setBounds(20,20,340,300);
            viewFrame.add(scrollPane);

            try{
                java.io.FileReader reader = new FileReader("students.txt");
                java.io.BufferedReader br = new BufferedReader(reader);
                String line;

                while((line = br.readLine()) != null){
                    textArea.append(line + "\n");
                }

                br.close();
            }catch (java.io.IOException ex){
                JOptionPane.showMessageDialog(viewFrame,"File not found");
            }

            viewFrame.setVisible(true);
        });

        frame.setVisible(true);
    }
}
