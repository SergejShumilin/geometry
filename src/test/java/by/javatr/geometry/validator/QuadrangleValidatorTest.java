package by.javatr.geometry.validator;

import by.javatr.geometry.calculator.CalculatorHelper;
import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class QuadrangleValidatorTest {
    private Quadrangle quadrangle = new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1));
    private CalculatorHelper calculatorHelper = Mockito.mock(CalculatorHelper.class);
    private QuadrangleValidator validator = new QuadrangleValidator(calculatorHelper);

    @Before
    public void init(){
        Mockito.when(calculatorHelper.calculateLengthSideA(quadrangle)).thenReturn(1);
        Mockito.when(calculatorHelper.calculateLengthSideB(quadrangle)).thenReturn(1);
        Mockito.when(calculatorHelper.calculateLengthSideC(quadrangle)).thenReturn(1);
    }

    @Test
    public void testIsQuadrangleShouldReturnTrue() {
        //given
        //when
        boolean actual = validator.isQuadrangle(quadrangle);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsTrapezoidShouldReturnFalse() {
        //given
        //when
        boolean trapezoid = validator.isTrapezoid(quadrangle);
        //then
        Assert.assertFalse(trapezoid);
    }

    @Test
    public void testIsSquareShouldReturnTrue() {
        //given
        //when
        boolean square = validator.isSquare(quadrangle);
        //then
        Assert.assertTrue(square);
    }

    @Test
    public void testIsRhombusShouldReturnFalse() {
        //given
        //when
        boolean rhombus = validator.isRhombus(quadrangle);
        //then
        Assert.assertFalse(rhombus);
    }


}