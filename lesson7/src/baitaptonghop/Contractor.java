package baitaptonghop;

public class Contractor extends nhanvien {
    private int gioLamViec;
    private double giaMoiGio;
    public Contractor(int manv, String ten, String email, double luongcb, int gioLamViec, double giaMoiGio) {
        super(manv, ten, email, luongcb);
        this.gioLamViec = gioLamViec;
        this.giaMoiGio = giaMoiGio;
    }
    @Override
    public double tinhluong() {
        return giaMoiGio * gioLamViec;
    }

    @Override
    public String toString() {
        return "Contractor | Mã: " + getManv() + ", Họ tên: " + getTen() +
                ", Email: " + getEmail() + ", Số giờ: " + gioLamViec +
                ", Đơn giá: " + giaMoiGio + ", Lương thực nhận: " + tinhluong();
    }
}
