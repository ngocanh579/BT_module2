package bt.Resizeable;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        Random rand = new Random();

        for (Resizeable shape : shapes) {
            double oldArea = 0;
            if (shape instanceof Circle) {
                oldArea = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                oldArea = ((Rectangle) shape).getArea();
            }

            double percent = rand.nextInt(100) + 1; // 1–100%
            shape.resize(percent);

            double newArea = 0;
            if (shape instanceof Circle) {
                newArea = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                newArea = ((Rectangle) shape).getArea();
            }

            System.out.printf("%s\nTăng %.0f%%\nDiện tích trước: %.2f -> sau: %.2f\n\n",
                    shape, percent, oldArea, newArea);
        }
    }
}
