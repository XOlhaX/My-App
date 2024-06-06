package Lesson13;

public class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public String getType() {
        if (isEquilateral()) {
            return "Equilateral";
        } else if (isRightAngled()) {
            return "Right-angled";
        } else if (isIsosceles()) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    private boolean isEquilateral() {
        return sideA == sideB && sideB == sideC;
    }

    private boolean isIsosceles() {
        return sideA == sideB || sideB == sideC || sideA == sideC;
    }

    private boolean isRightAngled() {
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;
        return a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2;
    }
}