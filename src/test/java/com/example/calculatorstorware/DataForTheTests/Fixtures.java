package com.example.calculatorstorware.DataForTheTests;

import com.example.calculatorstorware.resources.model.DividedLine;
import com.example.calculatorstorware.service.enums.Operation;

import java.util.Arrays;
import java.util.List;

public class Fixtures {
    public static List<String> listOfStringsFromFile = Arrays.asList("add 2","multiply 3","apply 10");

    public static List<DividedLine> fillArrayList() {
        return Arrays.asList(
                new DividedLine().digit(10),
                new DividedLine().name(Operation.add).digit(2),
                new DividedLine().name(Operation.multiply).digit(3));
    }

    public static List<DividedLine> fillArrayList1() {
        return Arrays.asList(
                new DividedLine().digit(0),
                new DividedLine().name(Operation.add).digit(3),
                new DividedLine().name(Operation.divide).digit(0));
    }
}
