package by.javatr.geometry.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataParser {
    private static final String REGEX_DIGIT = "\\d+";

    public List<Integer> parseString(String line) {
        List<Integer> coordinates = new ArrayList<Integer>();
            Pattern pattern = Pattern.compile(REGEX_DIGIT);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                String str = matcher.group();
                int digit = Integer.parseInt(str);
                coordinates.add(digit);
            }
        return coordinates;
    }
}
