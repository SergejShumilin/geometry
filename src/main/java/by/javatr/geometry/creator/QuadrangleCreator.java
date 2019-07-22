package by.javatr.geometry.creator;

import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import by.javatr.geometry.exception.DataMissingException;
import by.javatr.geometry.validator.DataValidator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class QuadrangleCreator {
    private final int COORDINATE_X_FIRST_POINT = 0;
    private final int COORDINATE_Y_FIRST_POINT = 1;
    private final int COORDINATE_X_SECOND_POINT = 2;
    private final int COORDINATE_Y_SECOND_POINT = 3;
    private final int COORDINATE_X_THIRD_POINT = 4;
    private final int COORDINATE_Y_THIRD_POINT = 5;
    private final int COORDINATE_X_FOURTH_POINT = 6;
    private final int COORDINATE_Y_FOURTH_POINT = 7;
    private DataValidator validator;

    public QuadrangleCreator(DataValidator validator) {
        this.validator = validator;
    }

    private List<Point> createListPoints(List<Integer> coordinates) {
        int x1 = coordinates.get(COORDINATE_X_FIRST_POINT);
        int y1 = coordinates.get(COORDINATE_Y_FIRST_POINT);
        Point first = new Point(x1, y1);

        int x2 = coordinates.get(COORDINATE_X_SECOND_POINT);
        int y2 = coordinates.get(COORDINATE_Y_SECOND_POINT);
        Point second = new Point(x2, y2);

        int x3 = coordinates.get(COORDINATE_X_THIRD_POINT);
        int y3 = coordinates.get(COORDINATE_Y_THIRD_POINT);
        Point third = new Point(x3, y3);

        int x4 = coordinates.get(COORDINATE_X_FOURTH_POINT);
        int y4 = coordinates.get(COORDINATE_Y_FOURTH_POINT);
        Point fourth = new Point(x4, y4);

        List<Point> points = Arrays.asList(first, second, third, fourth);

        return points;
    }

    public Optional<Quadrangle> createQuadrangle(List<Integer> coordinates) throws DataMissingException {
        if(!validator.isValid(coordinates)) {
            throw new DataMissingException("Incorrect data");
        }
        List<Point> points = createListPoints(coordinates);

        Point first = points.get(0);
        Point second = points.get(1);
        Point third = points.get(2);
        Point fourth = points.get(3);

        Quadrangle quadrangle = new Quadrangle(first, second, third, fourth);

        return Optional.of(quadrangle);
    }


}
