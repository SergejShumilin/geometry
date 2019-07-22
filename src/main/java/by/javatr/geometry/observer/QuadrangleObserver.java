package by.javatr.geometry.observer;

import by.javatr.geometry.calculator.QuadrangleCalculator;
import by.javatr.geometry.entity.Parameters;
import by.javatr.geometry.entity.Quadrangle;

import java.util.Map;

public class QuadrangleObserver implements Observer {
    private Map<Long, Parameters> parametersMap;

    private QuadrangleCalculator calculator;

    public QuadrangleObserver(Map<Long, Parameters> parametersMap, QuadrangleCalculator calculator) {
        this.parametersMap = parametersMap;
        this.calculator = calculator;
    }

    @Override
    public void update(Quadrangle quadrangle) {
      int area = calculator.calculateArea(quadrangle);
      int perimeter = calculator.calculatePerimeter(quadrangle);

      Parameters parameters = new Parameters(area, perimeter);
      parametersMap.put(quadrangle.getId(), parameters);
    }

    public Map<Long, Parameters> getParametersMap() {
        return parametersMap;
    }
}
