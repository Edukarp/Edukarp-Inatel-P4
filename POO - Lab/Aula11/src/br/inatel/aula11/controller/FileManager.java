package br.inatel.aula11.controller;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    public static void writeText(String filePath, String content){
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        }catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void readTxt(String filePath){
        try {
            FileReader fr = new FileReader((filePath));
            BufferedReader br = new BufferedReader(fr);
            /*
            System.out.println(br.read());
            br.close();
             */
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void readTxtScan(String fileName){
        try {
            FileReader fr = new FileReader(fileName);
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line + " ");
            }
            scan.close();
        }catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

}
