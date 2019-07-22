package by.javatr.geometry;

import by.javatr.geometry.calculator.CalculatorHelper;
import by.javatr.geometry.calculator.QuadrangleCalculator;
import by.javatr.geometry.entity.Parameters;
import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;
import by.javatr.geometry.observer.QuadrangleObserver;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Quadrangle quadrangle = new Quadrangle(new Point(1, 2), new Point(2, 2), new Point(2, 1), new Point(1, 1));
        Quadrangle quadrangl = new Quadrangle(new Point(1, 2), new Point(2, 5), new Point(2, 1), new Point(1, 1));

        QuadrangleCalculator calculator = new QuadrangleCalculator(new CalculatorHelper());
        QuadrangleObserver observer = new QuadrangleObserver(new HashMap<>(), calculator);
        quadrangle.setObserver(observer);

        int area = calculator.calculateArea(quadrangle);
        int area1 = calculator.calculateArea(quadrangl);
        int calculatePerimeter = calculator.calculatePerimeter(quadrangle);
        int calculatePerimeter1 = calculator.calculatePerimeter(quadrangl);
        Parameters parameters = new Parameters(area, calculatePerimeter);
        Parameters parameters1 = new Parameters(area1, calculatePerimeter1);

        Map<Long, Parameters> parametersMap = observer.getParametersMap();
        parametersMap.put(quadrangle.getId(), parameters);
        parametersMap.put(quadrangl.getId(), parameters1);
        for (Map.Entry entry : parametersMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        quadrangle.setFirst(new Point(3,5));
        for (Map.Entry entry : parametersMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
//        quadrangle.setSecond(new Point(28, 45));
//        for (Map.Entry entry : parametersMap.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: "
//                    + entry.getValue());
//        }
//        quadrangle.setSecond(new Point(8, 5));
//        for (Map.Entry entry : parametersMap.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: "
//                    + entry.getValue());
//        }
    }
}
