package xayDungHeThongDonHang;

public abstract class SanPham {
    private String name;

    public SanPham(String name, double gia) {
        this.name = name;
        this.gia = gia;
    }

    protected SanPham() {
    }

    public double getGia() {
        return gia;
    }

    public String getName() {
        return name;
    }
    private double gia;
    public abstract double tinhTienVanChuyen();
    public  double giaCuoiCung(){
        return gia + tinhTienVanChuyen();
    }

}
