package by.javatr.geometry.calculator;

import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class QuadrangleCalculatorTest {

    private final Quadrangle QUADRANGLE = new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1));
    private CalculatorHelper calculatorHelper = Mockito.mock(CalculatorHelper.class);
    private QuadrangleCalculator calculator = new QuadrangleCalculator(calculatorHelper);

    @Before
    public void init() {
        Mockito.when(calculatorHelper.calculateLengthSideA(QUADRANGLE)).thenReturn(1);
        Mockito.when(calculatorHelper.calculateLengthSideB(QUADRANGLE)).thenReturn(1);
        Mockito.when(calculatorHelper.calculateLengthSideC(QUADRANGLE)).thenReturn(1);
        Mockito.when(calculatorHelper.calculateLengthSideD(QUADRANGLE)).thenReturn(1);
    }

    @Test
    public void testCalculateAreaShouldReturnQuadrangleArea() {
        //given
        //when
        int actual = calculator.calculateArea(QUADRANGLE);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testCalculatePerimeterShouldReturnQuadranglePerimeter() {
        //given
        //when
        int actual = calculator.calculatePerimeter(QUADRANGLE);
        //then
        Assert.assertEquals(4, actual);
    }

}