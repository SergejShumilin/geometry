package by.javatr.geometry.scanner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private static final DataReader reader = new DataReader();
    private static final List<String> expected = new ArrayList<>();

    @Before
    public void fillCollection(){
        expected.addAll(Arrays.asList("fghj 1 sdsf 2 2 ghvfk 2 f 2 1 1 1"));
        expected.addAll(Arrays.asList("2 gjhjg 3 bhb 2 bhjll 2 e 2 3 4 5"));
    }
    @After
    public void clearCollection(){
        expected.clear();
    }

    @Test
    public void testReadFromFileShouldReturnListInteger() throws IOException {
        //given
        //when
        List<String> actual = reader.readFromFile(".\\src\\test\\resources\\data.txt");
        //then
        Assert.assertEquals(expected, actual);
    }

}