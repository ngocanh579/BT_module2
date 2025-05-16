public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (length + width)*2;
    }
    public void display() {
        System.out.println("Length: " + length + "\n Width: " + width);
    }


}
