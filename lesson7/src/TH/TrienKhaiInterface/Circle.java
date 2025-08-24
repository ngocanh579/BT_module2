package TH.TrienKhaiInterface;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle() {
        this.radius = 1.0;
        this.color = "green";
        this.filled = true;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "green";
        this.filled = true;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle(radius=" + radius + ", color=" + color + ", filled=" + filled + ")";
    }
}
