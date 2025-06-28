package Revision;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

//        WritingInFile wf = new WritingInFile();
//        int number =24;
//       wf.WriteFile(number);

//        ReadingFile rf = new ReadingFile();
//        rf.ReadFile();

        /*
        Challenge 3 (Bonus): Write a program that:

Takes user input and saves it to a file

Then reads the file and prints it
         */





    }
}

class WritingInFile {
    void WriteFile(int number) {
        try {
            FileWriter writer = new FileWriter("Output.txt");
            writer.write("Hello! I am a developer");
            writer.write(System.lineSeparator());
            writer.write(Integer.toString(number));
            writer.close();
            System.out.println("Successfully write");
        } catch (IOException e) {
            System.out.println("An error occurreed");
        }
    }
}

class ReadingFile{
    void ReadFile(){
        try{
            File file = new File("Output.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}


