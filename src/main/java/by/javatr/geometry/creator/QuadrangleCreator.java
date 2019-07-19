package by.javatr.geometry.creator;

import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import by.javatr.geometry.exception.IncorrectCoordinateException;
import by.javatr.geometry.validator.DataValidator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class QuadrangleCreator {
    private DataValidator validator;

    public QuadrangleCreator(DataValidator validator) {
        this.validator = validator;
    }

    private List<Point> createListPoints(List<Integer> coordinates) throws IncorrectCoordinateException {
        if(!validator.isValid(coordinates)) {
            throw new IncorrectCoordinateException("Incorrect data");
        }
            int x1 = coordinates.get(0);
            int y1 = coordinates.get(1);
            Point first = new Point(x1, y1);

            int x2 = coordinates.get(2);
            int y2 = coordinates.get(3);
            Point second = new Point(x2, y2);

            int x3 = coordinates.get(4);
            int y3 = coordinates.get(5);
            Point third = new Point(x3, y3);

            int x4 = coordinates.get(6);
            int y4 = coordinates.get(7);
            Point fourth = new Point(x4, y4);

            List<Point> points = Arrays.asList(first, second, third, fourth);

        return points;
    }

    public Optional<Quadrangle> createQuadrangle(List<Integer> coordinates) throws IncorrectCoordinateException {
        if (coordinates.size() < 8) {
            throw new IncorrectCoordinateException("It is not possible to construct a quadrilateral. Not enough data.");
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
