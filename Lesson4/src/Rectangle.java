public class Rectangle {
    public double length;
    public double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (length + width);
    }
    public void display() {
        System.out.println("Length: " + length + "\n Width: " + width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        r.display();
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
