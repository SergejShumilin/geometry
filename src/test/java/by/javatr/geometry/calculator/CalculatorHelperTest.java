package by.javatr.geometry.calculator;

import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorHelperTest {
    private CalculatorHelper calculator = new CalculatorHelper();
    private static final Quadrangle QUADRANGLE = new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1));

    @Test
    public void testCalculateLengthSideAShouldReturnRightLength() {
        //given
        //when
        int actual = calculator.calculateLengthSideA(QUADRANGLE);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCalculateLengthSideBShouldReturnRightLength() {
        //given
        //when
        int actual = calculator.calculateLengthSideB(QUADRANGLE);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCalculateLengthSideCShouldReturnRightLength() {
        //given
        //when
        int actual = calculator.calculateLengthSideC(QUADRANGLE);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCalculateLengthSideDShouldReturnRightLength() {
        //given
        //when
        int actual = calculator.calculateLengthSideC(QUADRANGLE);
        //then
        Assert.assertEquals(1, actual);
    }
}