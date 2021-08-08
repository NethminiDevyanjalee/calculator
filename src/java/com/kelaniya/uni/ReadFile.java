package com.kelaniya.uni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
   static String[] read(String filePath) {
        File file = new File(filePath);
        String[] numbers ={};
        try {
            Scanner scanner = new Scanner(file);
            numbers =  scanner.nextLine().split(" ");

        } catch (FileNotFoundException e) {
            System.out.println("File path is invalid");
        }
        return numbers;

    }
}
