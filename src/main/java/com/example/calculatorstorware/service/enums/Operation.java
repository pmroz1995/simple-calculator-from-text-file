package com.example.calculatorstorware.service.enums;

public enum Operation {

    add {
        public int apply(int a, int b) { return a + b; }
    },
    subtract {
        public int apply(int a, int b) { return a - b; }
    },
    multiply {
        public int apply(int a, int b) { return a * b; }
    },
    divide{
        public int apply(int a, int b){
            if(b == 0){
                throw new ArithmeticException("You can not divide by 0");
            }else {
                return a / b;
            }
        }
    };

    public abstract int apply(int a, int b);


}
