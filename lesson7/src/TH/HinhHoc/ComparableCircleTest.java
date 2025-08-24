package TH.HinhHoc;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];

        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle(); // default radius = 1.0
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles); // gọi compareTo()

        System.out.println("\nAfter-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}

