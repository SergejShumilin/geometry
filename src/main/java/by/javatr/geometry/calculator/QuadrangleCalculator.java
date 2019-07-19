package by.javatr.geometry.calculator;

import by.javatr.geometry.entity.Quadrangle;

public class QuadrangleCalculator {

    private HelperCalculator helperCalculator;

    public QuadrangleCalculator(HelperCalculator helperCalculator) {
        this.helperCalculator = helperCalculator;
    }

    public int calculateArea(Quadrangle square) {
        int lengthA = helperCalculator.calculateLengthSideA(square);
        int lengthB = helperCalculator.calculateLengthSideB(square);
        int lengthC = helperCalculator.calculateLengthSideC(square);
        int lengthD = helperCalculator.calculateLengthSideD(square);
        int halfPerimeter = calculatePerimeter(square) / 2;
        int area = (int) Math.sqrt((halfPerimeter - lengthA) * (halfPerimeter - lengthB) * (halfPerimeter - lengthC) * (halfPerimeter - lengthD));
        return area;
    }

    public int calculatePerimeter(Quadrangle square) {
        int lengthA = helperCalculator.calculateLengthSideA(square);
        int lengthB = helperCalculator.calculateLengthSideB(square);
        int lengthC = helperCalculator.calculateLengthSideC(square);
        int lengthD = helperCalculator.calculateLengthSideD(square);
        int perimeter = lengthA + lengthB + lengthC + lengthD;
        return perimeter;
    }

}
