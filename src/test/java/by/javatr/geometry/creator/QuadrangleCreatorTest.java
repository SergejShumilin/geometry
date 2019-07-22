package by.javatr.geometry.creator;

import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import by.javatr.geometry.exception.DataMissingException;
import by.javatr.geometry.validator.DataValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class QuadrangleCreatorTest {
    private DataValidator validator = Mockito.mock(DataValidator.class);
    private QuadrangleCreator CREATOR = new QuadrangleCreator(validator);
    private Quadrangle expectedQuadrangle = new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1));
    private static final List<Integer> COORDINATES = Arrays.asList(1, 2, 2, 2, 2, 1, 1, 1);
    private static final List<Integer> COORDINATES_ZERO = new ArrayList<Integer>();


    @Test
    public void testCreateQuadrangleShouldReturnQuadrangle() throws DataMissingException {
        //given
        Mockito.when(validator.isValid(COORDINATES)).thenReturn(true);
        //when
        Optional<Quadrangle> quadrangle = CREATOR.createQuadrangle(COORDINATES);
        //then
        Assert.assertTrue(quadrangle.isPresent());
        Assert.assertEquals(expectedQuadrangle, quadrangle.get());
    }

    @Test(expected = DataMissingException.class)
    public void testCreateQuadrangleShouldThrowExceptionWhenListCoordinatesIsEmpty() throws DataMissingException {
        //given
        //when
        CREATOR.createQuadrangle(COORDINATES_ZERO);
        ///then
    }
}