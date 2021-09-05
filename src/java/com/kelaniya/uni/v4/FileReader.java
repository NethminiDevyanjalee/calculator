package com.kelaniya.uni.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public Double[] getnumbers() throws IOException {

        //read the numbers from text file
        List<String> numbersString = Files.readAllLines(
                Paths.get("C:\\Users\\NETHMINIDEVYANJALEE\\Desktop\\calculator\\numberInputs")
        );


        double number1 = Double.parseDouble(numbersString.get(0));
        double number2 = Double.parseDouble(numbersString.get(1));

        return new Double[]{number1,number2};

    }
}
