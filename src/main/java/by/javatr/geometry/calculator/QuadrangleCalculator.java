package by.javatr.geometry.calculator;

import by.javatr.geometry.entity.Quadrangle;

public class QuadrangleCalculator {

    private CalculatorHelper calculatorHelper;

    public QuadrangleCalculator(CalculatorHelper calculatorHelper) {
        this.calculatorHelper = calculatorHelper;
    }

    public int calculateArea(Quadrangle square) {
        int lengthA = calculatorHelper.calculateLengthSideA(square);
        int lengthB = calculatorHelper.calculateLengthSideB(square);
        int lengthC = calculatorHelper.calculateLengthSideC(square);
        int lengthD = calculatorHelper.calculateLengthSideD(square);
        int halfPerimeter = calculatePerimeter(square) / 2;
        int area = (int) Math.sqrt((halfPerimeter - lengthA) * (halfPerimeter - lengthB) * (halfPerimeter - lengthC) * (halfPerimeter - lengthD));
        return area;
    }

    public int calculatePerimeter(Quadrangle square) {
        int lengthA = calculatorHelper.calculateLengthSideA(square);
        int lengthB = calculatorHelper.calculateLengthSideB(square);
        int lengthC = calculatorHelper.calculateLengthSideC(square);
        int lengthD = calculatorHelper.calculateLengthSideD(square);
        int perimeter = lengthA + lengthB + lengthC + lengthD;
        return perimeter;
    }

}
