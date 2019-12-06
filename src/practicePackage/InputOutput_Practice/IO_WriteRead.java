package practicePackage.InputOutput_Practice;

import java.io.*;

public class IO_WriteRead {


        public static void main(String[] args){

            FileOutputStream out;

            try{
                // create the FileInputStream object
                // after you run this you should see the example.txt file in this REPL
                out = new FileOutputStream("example_1.txt");

               String words = "We're writing this to a file using a byte stream";
               byte[] bytes = words.getBytes();

                // write the bytes using the FileOutputStream (a byte stream)
               // out.write(bytes);

                // close the connection to the file
                out.close();
            }catch(IOException e1){
                System.out.println("error detected");
                e1.printStackTrace();
            }

            try{

                FileInputStream in = new FileInputStream("example.txt");

                // this int will hold the byte we read in from the file
                int i;

                // while there are more bytes to read, continue looping
                // the FileInputStream read() methods returns -1 when it reaches the end of the file
                while((i = in.read()) != -1){
                    // cast the int to a char (so it's a letter) and print it out
                    System.out.print((char) i);
                }

                // close the connection to the file
                in.close();

            }catch(IOException e2){
                System.out.println("error detected");
                e2.printStackTrace();
            }
        }
    }

