package bai7;

public class Circle implements GeometricObject {


    protected double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double CV = 2 * 3.14 * radius;
        return CV;
    }

    @Override
    public double getArea() {
        double DT = 3.14 * radius * radius;
        return DT;
    }

}
