package com.example.calculatorstorware.service;

import org.junit.Before;
import org.junit.Test;

import static com.example.calculatorstorware.DataForTheTests.Fixtures.fillArrayList;
import static com.example.calculatorstorware.DataForTheTests.Fixtures.fillArrayList1;
import static org.junit.Assert.assertEquals;


public class ServiceImpIT {

    private Service service;

    @Before
    public void setUp(){
        service = new ServiceImpl();
    }

    @Test
    public void checkIfCalculateWorksProperly(){
        assertEquals(36,service.calculate(fillArrayList()));
    }

    @Test(expected = ArithmeticException.class)
    public void checkIfCalculateWorksProperly1(){
       assertEquals(3,service.calculate(fillArrayList1()));
    }



}
