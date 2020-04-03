package com.example.calculatorstorware;

import com.example.calculatorstorware.resources.ReadingDataFromFile;
import com.example.calculatorstorware.resources.ReadingDataFromFileImpl;
import com.example.calculatorstorware.resources.model.DividedLine;
import com.example.calculatorstorware.service.Service;
import com.example.calculatorstorware.service.ServiceImpl;

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
