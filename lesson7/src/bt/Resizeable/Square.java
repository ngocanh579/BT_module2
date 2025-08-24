package bt.Resizeable;

public class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void resize(double percent) {
        width += width * percent / 100;
        height = width; // vẫn đảm bảo là hình vuông
    }

    @Override
    public String toString() {
        return "Square(side=" + width + ")";
    }
}

