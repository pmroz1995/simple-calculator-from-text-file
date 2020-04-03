package com.example.calculatorstorware.service;

import com.example.calculatorstorware.resources.model.DividedLine;
import com.example.calculatorstorware.service.enums.Operation;

import java.util.List;

public class ServiceImpl implements Service {

    public static final int APPLY_DIGIT_INDEX = 0;

    @Override
    public int calculate(List<DividedLine> dividedLines) {
        int temp = dividedLines.get(APPLY_DIGIT_INDEX).getDigit();

        for(int i = 1; i < dividedLines.size(); i++) {
            temp = choseOperation(temp,dividedLines.get(i).getDigit(),dividedLines.get(i).getName());
        }
        return temp;
    }

    public int choseOperation(int x, int y, Operation operation) {

        switch (operation) {
            case add:
                break;
            case subtract:
                break;
            case divide:
                break;
            case multiply:
                break;
            default:
                System.out.println("Bad Operation");
        }
        return operation.apply(x,y);
    }



}
