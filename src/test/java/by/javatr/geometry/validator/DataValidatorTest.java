package by.javatr.geometry.validator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DataValidatorTest {
    private DataValidator validator = new DataValidator();
    private static final List<Integer> LIST_POSITIVE_NUMBER = Arrays.asList(1, 2, 3, 4, 4,7,6,5);
    private static final List<Integer> NEGATIVE_NUMBER = Arrays.asList(1, 2, -3, 4, 4,5,7,3);
    private static final List<Integer> ENOUGH_DATA = Arrays.asList(1, 2, 3, 4, 4,5,7,5);
    private static final List<Integer> NOT_ENOUGH_DATA = Arrays.asList(1, 2, 4, 4,5,7,5);


    @Test
    public void testIsValidShouldReturnTrueWhenPositiveNumber() {
        //given
        //when
        boolean valid = validator.isValid(LIST_POSITIVE_NUMBER);
        //then
        Assert.assertTrue(valid);
    }

    @Test
    public void testIsValidShouldReturnTrueWhenListSizeEight() {
        //given
        //when
        boolean valid = validator.isValid(ENOUGH_DATA);
        //then
        Assert.assertTrue(valid);
    }

    @Test
    public void testIsValidShouldReturnFalseWhenNegativeNumber() {
        //given
        //when
        boolean valid = validator.isValid(NEGATIVE_NUMBER);
        //then
        Assert.assertFalse(valid);
    }

    @Test
    public void testIsValidShouldReturnTrueWhenNotEnoughData() {
        //given
        //when
        boolean valid = validator.isValid(NOT_ENOUGH_DATA);
        //then
        Assert.assertFalse(valid);
    }
}