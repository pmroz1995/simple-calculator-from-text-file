package com.example.calculatorstorware.resources.model;

import com.example.calculatorstorware.service.enums.Operation;

import java.util.Objects;


public class DividedLine {

    private Operation name;

    private int digit;

    public static final DividedLine divideLine(){
        return new DividedLine();
    }

    public void setName(Operation name) {
        this.name = name;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public Operation getName() {
        return name;
    }

    public int getDigit() {
        return digit;
    }

    public DividedLine name(Operation name) {
        this.name = name;
        return this;
    }

    public DividedLine digit(int digit) {
        this.digit = digit;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DividedLine that = (DividedLine) o;
        return digit == that.digit &&
                name == that.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, digit);
    }

    @Override
    public String toString() {
        return "DividedLine{" +
                "name=" + name +
                ", digit=" + digit +
                '}';
    }

}
