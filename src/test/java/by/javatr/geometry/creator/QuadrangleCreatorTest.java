package by.javatr.geometry.creator;

import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import by.javatr.geometry.exception.IncorrectCoordinateException;
import by.javatr.geometry.validator.DataParser;
import by.javatr.geometry.validator.DataValidator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class QuadrangleCreatorTest {

    private static final QuadrangleCreator CREATOR = new QuadrangleCreator(new DataValidator());
    private static final List<Integer> COORDINATES = Arrays.asList(1, 2, 2, 2, 2, 1, 1, 1);
    private static final List<Integer> COORDINATES_ZERO = new ArrayList<Integer>();
    private static final Optional<Quadrangle> expectedQuadrangle = Optional.of(new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1)));


    @Test
    public void testCreateQuadrangleShouldReturnQuadrangle() throws IncorrectCoordinateException {
        //given
        //when
        Optional<Quadrangle> quadrangle = CREATOR.createQuadrangle(COORDINATES);
        //then
        Assert.assertEquals(expectedQuadrangle, quadrangle);
    }

    @Test(expected = IncorrectCoordinateException.class)
    public void testCreateQuadrangleShouldThrowExceptionWhenListCoordinatesIsEmpty() throws IncorrectCoordinateException {
        //given
        //when
        CREATOR.createQuadrangle(COORDINATES_ZERO);
        ///then
    }
}