package by.javatr.geometry.calculator;

import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;

public class CalculatorHelper {

    public int calculateLengthSideA(Quadrangle quadrangle) {
        Point first = quadrangle.getFirst();
        int x1 = first.getX();
        Point second = quadrangle.getSecond();
        int x2 = second.getX();
        return x2 - x1;
    }

    public int calculateLengthSideB(Quadrangle quadrangle) {
        Point second = quadrangle.getSecond();
        int y2 = second.getY();
        Point third = quadrangle.getThird();
        int y1 = third.getY();
        return y2-y1;
    }

    public int calculateLengthSideC(Quadrangle quadrangle) {
        Point first = quadrangle.getFirst();
        int x1 = first.getX();
        Point second = quadrangle.getSecond();
        int x2 = second.getX();
        return x2 - x1;
    }

    public int calculateLengthSideD(Quadrangle quadrangle) {
        Point first = quadrangle.getFirst();
        int y2 = first.getY();
        Point fourth = quadrangle.getFourth();
        int y1 = fourth.getY();
        return y2 - y1;
    }
}
