package com.example.calculator;

import com.example.calculator.resources.ReadingDataFromFile;
import com.example.calculator.resources.ReadingDataFromFileImpl;
import com.example.calculator.resources.model.DividedLine;
import com.example.calculator.service.Service;
import com.example.calculator.service.ServiceImpl;

import java.util.List;

public class Main {

    private static ReadingDataFromFile readingDataFromFile = new ReadingDataFromFileImpl();
    private static Service service = new ServiceImpl();


    public static void main(String[] args) {
        try {
            List<String> dataFromFile = readingDataFromFile.readingFile(args[0]);

            List<DividedLine> dividedLines = readingDataFromFile.divideLines(dataFromFile);

            System.out.println(service.calculate(dividedLines));
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }

}
