package by.javatr.geometry.validator;

import by.javatr.geometry.calculator.CalculatorHelper;
import by.javatr.geometry.entity.Point;
import by.javatr.geometry.entity.Quadrangle;

public class QuadrangleValidator {

    private CalculatorHelper calculatorHelper;

    public QuadrangleValidator(CalculatorHelper calculatorHelper) {
        this.calculatorHelper = calculatorHelper;
    }

    public boolean isQuadrangle(Quadrangle quadrangle){
        Point first = quadrangle.getFirst();
        int x1 = first.getX();
        int y1 = first.getY();
        Point second = quadrangle.getSecond();
        int x2 = second.getX();
        int y2 = second.getY();
        Point third = quadrangle.getThird();
        int x3 = third.getX();
        int y3 = third.getY();

        return x1 != x3 || x2 != x3 && y1!=y3 || y2!=y3;
    }

    public boolean isTrapezoid(Quadrangle quadrangle) {
        int sideA = calculatorHelper.calculateLengthSideA(quadrangle);
        int sideC = calculatorHelper.calculateLengthSideC(quadrangle);
        return sideA != sideC;
    }

    public boolean isSquare(Quadrangle quadrangle) {
        int sideA = calculatorHelper.calculateLengthSideA(quadrangle);
        int sideB = calculatorHelper.calculateLengthSideB(quadrangle);
        int sideC = calculatorHelper.calculateLengthSideC(quadrangle);

        return sideA == sideB && sideA == sideC;
    }

    public boolean isRhombus(Quadrangle quadrangle){
        int sideA = calculatorHelper.calculateLengthSideA(quadrangle);
        int sideB = calculatorHelper.calculateLengthSideB(quadrangle);
        int sideC = calculatorHelper.calculateLengthSideC(quadrangle);

        return sideA == sideB && sideA != sideC;
    }

}
