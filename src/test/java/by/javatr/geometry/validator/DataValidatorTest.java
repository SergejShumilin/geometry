package by.javatr.geometry.validator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DataValidatorTest {
private static final List<Integer> listPositiveNumber = Arrays.asList(1,2,3,4,4);
private static final DataValidator validator = new DataValidator();

    @Test
    public void testIsValidShouldReturnTrue() {
        //given
        //when
        boolean valid = validator.isValid(listPositiveNumber);
        //then
        Assert.assertTrue(valid);
    }
}