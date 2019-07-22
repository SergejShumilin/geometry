package by.javatr.geometry.observer;

import by.javatr.geometry.calculator.QuadrangleCalculator;
import by.javatr.geometry.entity.Parameters;
import by.javatr.geometry.entity.QuadrangleCopy;

import java.util.Map;

public class QuadrangleObserver implements Observer {
    private Map<Long, Parameters> parametersMap;
    private QuadrangleCalculator calculator;

    public QuadrangleObserver(QuadrangleCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void update(QuadrangleCopy quadrangle) {
      int area = calculator.calculateArea(quadrangle);
      int perimeter = calculator.calculatePerimeter(quadrangle);

      Parameters parameters = new Parameters(area, perimeter);
      parametersMap.put(quadrangle.getId(), parameters);
    }
}
