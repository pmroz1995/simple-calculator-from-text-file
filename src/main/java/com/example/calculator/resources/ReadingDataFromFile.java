package com.example.calculator.resources;

import com.example.calculator.resources.model.DividedLine;

import java.util.List;

public interface ReadingDataFromFile {

    List<String> readingFile(String path);
    List<DividedLine> divideLines(List<String> linesNotYetDivided);
}
