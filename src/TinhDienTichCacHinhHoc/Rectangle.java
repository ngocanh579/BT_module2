package TinhDienTichCacHinhHoc;

public class Rectangle {
    private double length,width;
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải lớn hơn 0.");
        }
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }

}
