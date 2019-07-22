package by.javatr.geometry.validator;

import java.util.List;

public class DataValidator {
    public boolean isValid(List<Integer> coordinates) {
        if (coordinates.size() < 8) {
            return false;
        }
        for (int number : coordinates) {
            if (number < 1) {
                return false;
            }
        }
        return true;
    }
}
