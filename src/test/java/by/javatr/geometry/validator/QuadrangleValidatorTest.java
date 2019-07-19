package by.javatr.geometry.validator;

import by.javatr.geometry.calculator.HelperCalculator;
import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class QuadrangleValidatorTest {
    private static final Quadrangle quadrangle = new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1));
    private static final QuadrangleValidator validator = new QuadrangleValidator(new HelperCalculator());
    private static final HelperCalculator calculator = Mockito.mock(HelperCalculator.class);

    @Test
    public void testIsQuadrangleShouldReturnTrue() {
        //given
        //when
        boolean quadrangle = validator.isQuadrangle(QuadrangleValidatorTest.quadrangle);
        //then
        Assert.assertTrue(quadrangle);
    }

    @Test
    public void testIsTrapezoidShouldReturnFalse() {
        //given
        Mockito.when(calculator.calculateLengthSideA(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideC(quadrangle)).thenReturn(1);
        //when
        boolean trapezoid = validator.isTrapezoid(quadrangle);
        //then
        Assert.assertFalse(trapezoid);
    }

    @Test
    public void testIsSquareShouldReturnTrue() {
        //given
        Mockito.when(calculator.calculateLengthSideA(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideB(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideC(quadrangle)).thenReturn(1);
        //when
        boolean square = validator.isSquare(quadrangle);
        //then
        Assert.assertTrue(square);
    }

    @Test
    public void testIsRhombusShouldReturnFalse() {
        //given
        Mockito.when(calculator.calculateLengthSideA(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideB(quadrangle)).thenReturn(1);
        Mockito.when(calculator.calculateLengthSideC(quadrangle)).thenReturn(1);
        //when
        boolean rhombus = validator.isRhombus(quadrangle);
        //then
        Assert.assertFalse(rhombus);
    }


}