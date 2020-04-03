package com.example.calculatorstorware.resources;


import com.example.calculatorstorware.resources.model.DividedLine;
import com.example.calculatorstorware.service.enums.Operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingDataFromFileImpl implements ReadingDataFromFile {

    public List<String> readingFile(String path){

        List<String> fileLines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNext()) {
                fileLines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            throw new RuntimeException("You pointed bad directory!!!");
        }
        return fileLines;
    }

    public ArrayList<DividedLine> divideLines(List<String> linesNotYetDivided){

        ArrayList<DividedLine> dividedLines = new ArrayList<>();
        dividedLines.add(
                DividedLine.divideLine()
                        .digit(Integer.parseInt((divideSingleLine(linesNotYetDivided.get(linesNotYetDivided.size()-1))[1]))
                        ));
        for(int i = 0; i < linesNotYetDivided.size()-1; i++){
            dividedLines.add(DividedLine.divideLine()
                    .name(parseStringToOperation(divideSingleLine(linesNotYetDivided.get(i))[0]))
                    .digit(Integer.parseInt((divideSingleLine(linesNotYetDivided.get(i))[1])))
            );
        }

        return dividedLines;
    }

    public Operation parseStringToOperation(String operationString){
        return Operation.valueOf(operationString);
    }

    public static String[] divideSingleLine(String singleLine){
        return singleLine.split(" ", 2);
    }


}
