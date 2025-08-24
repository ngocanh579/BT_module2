package TH.TrienKhaiInterface;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle(); // mặc định radius = 1.0
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles, new CircleComparator());

        System.out.println("\nAfter-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
