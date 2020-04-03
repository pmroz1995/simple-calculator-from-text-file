package com.example.calculatorstorware.resources;

import com.example.calculatorstorware.resources.model.DividedLine;

import java.util.List;

public interface ReadingDataFromFile {

    List<String> readingFile(String path);
    List<DividedLine> divideLines(List<String> linesNotYetDivided);
}
