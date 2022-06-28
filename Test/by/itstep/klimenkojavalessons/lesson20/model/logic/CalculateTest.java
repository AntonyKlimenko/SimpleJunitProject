package by.itstep.klimenkojavalessons.lesson20.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {
    @Test

    // Rule AAA!!!

    public void testSum() {
        // Arrange

        int a = 10;
        int b = 5;
        int expected = 15;

        // Act
        int actual = Calculator.sum(a, b);

        //Assert

        if (expected != actual) {
            Assert.fail();


        }
    }
    @Test
    public void testSun() {
        // Arrange

        int a = 10;
        int b = 5;
        int expected = 5;

        // Act
        int actual = Calculator.sun(a, b);

        //Assert

        if (expected != actual) {
            Assert.fail();


        }
    }
    @Test
    public void testMul() {
        // Arrange

        int a = 10;
        int b = 5;
        int expected = 50;

        // Act
        int actual = Calculator.mul(a, b);

        //Assert

        Assert.assertEquals(expected, actual);


        }


    @Test
    public void testDiv() {
        // Arrange

        int a = 10;
        int b = 5;
        int expected = 2;

        // Act
        int actual = Calculator.div(a, b);

        //Assert

        if (expected != actual) {
            Assert.fail();


        }
    }








}
