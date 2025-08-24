package TinhDienTichCacHinhHoc;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("bán kính  phải lớn hơn 0.");
        }
        if (radius >= 100) {
            throw new IllegalArgumentException("bán kính  phải nhỏ hơn 100.");
        }
        this.radius = radius;
    }
    public String  area() {
        double area = Math.PI * radius * radius;
        return String.format("%.2f", area);
    }
}
