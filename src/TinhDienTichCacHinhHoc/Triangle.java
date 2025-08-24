package TinhDienTichCacHinhHoc;

public class Triangle {
    private double base,height;
    public Triangle(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Cạnh đáy và chiều cao phải lớn hơn 0.");
        }
        this.base = base;
        this.height = height;
    }
    public double area() {
        return 0.5* base * height;
    }
}
