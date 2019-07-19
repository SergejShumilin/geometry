package by.javatr.geometry.calculator;

import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class QuadrangleCalculatorTest {

    private static final Quadrangle quadrangle = new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1));
    private static final QuadrangleCalculator CALCULATOR = new QuadrangleCalculator(new HelperCalculator());
    private static final HelperCalculator calculator = Mockito.mock(HelperCalculator.class);

    @Test
    public void testCalculateAreaShouldReturnQuadrangleArea() {
        //given
        Mockito.when(calculator.calculateLengthSideA(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideB(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideC(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideD(quadrangle)).thenReturn(1);
        //when
        int actual = CALCULATOR.calculateArea(quadrangle);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCalculatePerimeterShouldReturnQuadranglePerimeter() {
        //given
        Mockito.when(calculator.calculateLengthSideA(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideB(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideC(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideD(quadrangle)).thenReturn(1);
        //when
        int actual = CALCULATOR.calculatePerimeter(quadrangle);
        //then
        Assert.assertEquals(4, actual);
    }

}