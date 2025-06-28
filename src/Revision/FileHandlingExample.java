package Revision;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "userinput.txt";

        try{
            //write file
            System.out.println("Enter your name:");
            String data = sc.nextLine();
            FileWriter writer = new FileWriter(filename);
            writer.write(data);
            writer.close();

            //read file
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String filedata = reader.nextLine();
                System.out.println(filedata);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Error occcured");
        }

        sc.close();
    }
}
