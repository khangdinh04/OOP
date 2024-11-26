package bai9;

public class Triangle extends Shape {

	private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public Triangle() {

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double A = 0.5f * base * height;
        return A;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}
