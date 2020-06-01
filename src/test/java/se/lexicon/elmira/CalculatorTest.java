package se.lexicon.elmira;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test_addition() {

        //Arrange
        Calculator calculator = new Calculator();
        double num1 = 2.3;
        double num2 = 6.8;
        double actual;

        double expected = 9.1;

        //Act
        actual = calculator.add(num1, num2);


        //Assert
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void test_subtraction() {
        //Arrange
        Calculator calculator = new Calculator();
        double num1 = 56.9;
        double num2 = 22.7;
        double actual;

        double expected = 34.2;

        //Act
        actual = calculator.Subtract(num1, num2);


        //Assert
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void test_multiplication() {
        //Arrange
        Calculator calculator = new Calculator();
        double num1 = 46;
        double num2 = 2.5;
        double actual;

        double expected = 115;

        //Act
        actual = calculator.multiply(num1, num2);


        //Assert
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void test_division() {
        //Arrange
        Calculator calculator = new Calculator();
        double num1 = 17.5;
        double num2 = 23.4;
        double actual;

        double expected = 0.7478632478632479;

        //Act
        actual = calculator.division(num1, num2);


        //Assert
        Assert.assertEquals(expected, actual, 0);
    }
}
