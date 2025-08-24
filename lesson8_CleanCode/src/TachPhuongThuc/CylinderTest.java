package TachPhuongThuc;

public class CylinderTest {
    public static void main(String[] args) {
        int radius = 5;
        int height = 10;

        double volume = Cylinder.getVolume(radius, height);
        System.out.printf("Thể tích hình trụ (r = %d, h = %d): %.2f\n", radius, height, volume);
    }
}

