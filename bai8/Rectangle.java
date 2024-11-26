package bai8;

public class Rectangle extends Shape {

	private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double S = length * width;
        return S;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

}
