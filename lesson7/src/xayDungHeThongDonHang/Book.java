package xayDungHeThongDonHang;

public class Book extends SanPham implements loaisanpham{
    @Override
    public double tinhTienVanChuyen() {
        return 25000;
    }
    @Override
    public double chietkhauphantram(){
        return 0;
    }
}
