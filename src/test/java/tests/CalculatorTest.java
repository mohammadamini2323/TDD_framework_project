package tests;

import core.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void sumTest(){
        Calculator calculator=new Calculator();
        Assertions.assertEquals(14,calculator.sum(10,4)," the result should be 14");
    }

}
