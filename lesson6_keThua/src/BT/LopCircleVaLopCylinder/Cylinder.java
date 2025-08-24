package BT.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super(); // Gọi constructor Circle()
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius); // Gọi constructor Circle(radius)
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Gọi constructor Circle(radius, color)
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius = " + getRadius() +
                ", height = " + height +
                ", color = " + getColor() +
                ", base area = " + getArea() +
                ", volume = " + getVolume();
    }
}

