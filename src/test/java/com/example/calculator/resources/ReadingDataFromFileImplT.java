package com.example.calculator.resources;


import com.example.calculator.service.enums.Operation;
import org.junit.Before;
import org.junit.Test;


import static com.example.calculator.DataForTheTests.Fixtures.fillArrayList;
import static com.example.calculator.DataForTheTests.Fixtures.listOfStringsFromFile;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class ReadingDataFromFileImplT {

    private ReadingDataFromFile readingDataFromFile;

    @Before
    public void setUp(){
         readingDataFromFile = new ReadingDataFromFileImpl();
     }

    @Test
    public void checkIfDivideLinesWorksProperly(){
        assertThat(fillArrayList(),is(readingDataFromFile.divideLines(listOfStringsFromFile)));
    }

    @Test
    public void checkIfDivideLinesHasProperSize(){
        assertThat(readingDataFromFile.divideLines(listOfStringsFromFile),hasSize(3));
    }

    @Test
    public void checkingIfParsingStringToOperationEnumWorksProperly(){
        assertEquals(Operation.add,new ReadingDataFromFileImpl().parseStringToOperation("add"));
    }

}
