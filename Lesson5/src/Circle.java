public class Circle {
    private double radius = 1.0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    private String color = "red";
    public Circle(double radius){
        this.radius = radius;

    }

    public Circle(){}


}
