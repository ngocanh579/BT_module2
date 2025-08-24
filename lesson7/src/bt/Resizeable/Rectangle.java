package bt.Resizeable;

public class Rectangle implements Resizeable {
    protected double width;
    protected double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        width += width * percent / 100;
        height += height * percent / 100;
    }

    @Override
    public String toString() {
        return "Rectangle(width=" + width + ", height=" + height + ")";
    }
}
