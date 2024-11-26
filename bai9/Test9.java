package bai9;

public class Test9 {
	public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        Triangle[] triangles = new Triangle[2];
        for (int i = 0; i < 2; i++) {
            rectangles[i] = new Rectangle("Do", 4, 2);
            triangles[i] = new Triangle("Vang", 2, 5);
        }
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }
    }
}
