package by.javatr.geometry;

import by.javatr.geometry.Director;
import by.javatr.geometry.creator.QuadrangleCreator;
import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import by.javatr.geometry.exception.IncorrectCoordinateException;
import by.javatr.geometry.scanner.DataReader;
import by.javatr.geometry.validator.DataParser;
import by.javatr.geometry.validator.DataValidator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DirectorTest {
    private static final DataReader dataReader = Mockito.mock(DataReader.class);
    private static final DataParser parser = Mockito.mock(DataParser.class);
    private static final QuadrangleCreator creator = Mockito.mock(QuadrangleCreator.class);
    private static final Director director = new Director(new DataReader(), new DataParser(), new QuadrangleCreator(new DataValidator()));
    private static final List<String> list = Arrays.asList("fghj 1 sdsf 2 2 ghvfk 2 f 2 1 1 1");
    private static final String line = "fghj 1 sdsf 2 2 ghvfk 2 f 2 1 1 1";
    private static final List<Integer> integers = Arrays.asList(1, 2, 2, 2, 2, 1, 1, 1);
    private static final Quadrangle quadrangle = new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1));
    private static final  List<Optional<Quadrangle>> listQuadrangle = new ArrayList<>();

    @Before
    public void fillCollection(){
        listQuadrangle.add(Optional.of(quadrangle));
    }
    @Before
    public void clearCollection(){
        listQuadrangle.clear();
    }

    @Test
    public void testCreateQuadrangleShould() throws IOException, IncorrectCoordinateException {
        Mockito.when(dataReader.readFromFile(".\\data.txt")).thenReturn(list);
        Mockito.when(parser.parseString(line)).thenReturn(integers);
        Mockito.when(creator.createQuadrangle(integers)).thenReturn(Optional.of(quadrangle));
        List<Optional<Quadrangle>> actual = director.createQuadrangle(".\\src\\test\\resources\\listData.txt");

        Assert.assertEquals(listQuadrangle, actual);
    }
}