package by.javatr.geometry.scanner;

import by.javatr.geometry.exception.DataMissingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private DataReader reader = new DataReader();
    private static final String PATH = ".\\src\\test\\resources\\data.txt";
    private static final String INCORRECT_PATH = ".\\src\\test\\resources\\dat.txt";
    private static final List<String> EXPECTED = Arrays.asList(
            "fghj 1 sdsf 2 2 ghvfk 2 f 2 1 1 1",
            "2 gjhjg 3 bhb 2 bhjll 2 e 2 3 4 5"
    );



    @Test
    public void testReadFromFileShouldReturnListInteger() throws IOException, DataMissingException {
        //given
        //when
        List<String> actual = reader.readFromFile(PATH);
        //then
        Assert.assertEquals(EXPECTED, actual);
    }

    @Test(expected = DataMissingException.class)
    public void testReadFromFileShouldThrowException() throws IOException, DataMissingException {
        //given
        //when
        List<String> actual = reader.readFromFile(INCORRECT_PATH);
        //then
    }

}