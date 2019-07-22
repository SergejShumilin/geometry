package by.javatr.geometry;

import by.javatr.geometry.Director;
import by.javatr.geometry.creator.QuadrangleCreator;
import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import by.javatr.geometry.exception.DataMissingException;
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
    private DataReader dataReader = Mockito.mock(DataReader.class);
    private DataParser parser = Mockito.mock(DataParser.class);
    private QuadrangleCreator creator = Mockito.mock(QuadrangleCreator.class);
    private Director director = new Director(dataReader, parser, creator);
    private static final List<String> list = Arrays.asList("fghj 1 sdsf 2 2 ghvfk 2 f 2 1 1 1");
    private static final String PATH = ".\\src\\test\\resources\\data.txt";
    private static final List<Integer> integers = Arrays.asList(1, 2, 2, 2, 2, 1, 1, 1);
    private static final Quadrangle quadrangle = new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1));
    private static final List<Quadrangle> listQuadrangle = new ArrayList<>();

    @Before
    public void init() throws IOException, DataMissingException {
        Mockito.when(dataReader.readFromFile(PATH)).thenReturn(list);
        Mockito.when(parser.parseString(list.get(0))).thenReturn(integers);
        Mockito.when(creator.createQuadrangle(integers)).thenReturn(Optional.of(quadrangle));
        listQuadrangle.add(quadrangle);
    }


    @Test
    public void testCreateQuadrangleShouldReturnListQuadrangle() throws IOException, DataMissingException {
        //given
        //when
        List<Quadrangle> actual = director.createQuadrangle(PATH);
        //then
        Assert.assertEquals(listQuadrangle, actual);
    }
}