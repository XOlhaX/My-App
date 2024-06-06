package HW13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape[] shapes = new Shape[4];

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        shapes[0] = new Circle(radius);

        System.out.print("Enter the sides of the first triangle: ");
        double sideA1 = scanner.nextDouble();
        double sideB1 = scanner.nextDouble();
        double sideC1 = scanner.nextDouble();
        shapes[1] = new Triangle(sideA1, sideB1, sideC1);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        shapes[2] = new Square(side);

        System.out.print("Enter the sides of the second triangle: ");
        double sideA2 = scanner.nextDouble();
        double sideB2 = scanner.nextDouble();
        double sideC2 = scanner.nextDouble();
        shapes[3] = new Triangle(sideA2, sideB2, sideC2);

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);

        for (Shape shape : shapes) {
            if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                System.out.println("Triangle with sides " + triangle.sideA + ", " + triangle.sideB + ", " + triangle.sideC + " is " + triangle.getType());
            }
        }

        scanner.close();
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + area);
            totalArea += area;
        }
        return totalArea;
    }
}