package bt.Colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3.0); // có triển khai Colorable

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Diện tích: " + shape.getArea());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println();
        }
    }
}
