package com.kelaniya.uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {

    public Double[] getNumbers() throws NumberRepositoryException {

        //read the numbers from text file
        List<String> numbersString;
        try {
            numbersString = Files.readAllLines(
                    Paths.get("C:\\Users\\NETHMINIDEVYANJALEE\\Desktop\\calculator\\numberInputs")
            );
        } catch (IOException e) {
            throw new NumberRepositoryException(e,"Couldn't read the text file.");
        }


        double number1 = Double.parseDouble(numbersString.get(0));
        double number2 = Double.parseDouble(numbersString.get(1));

        return new Double[]{number1,number2};

    }
}
