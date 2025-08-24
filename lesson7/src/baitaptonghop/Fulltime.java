package baitaptonghop;

public class Fulltime extends nhanvien {
    private double phucap;
    public Fulltime(int manv, String ten, String email, double luongcb, double phucap) {
        super(manv, ten, email, luongcb);
        this.phucap = phucap;
    }
    @Override
    public double tinhluong() {
        return getLuongcb() + phucap;
    }

    @Override
    public String toString() {
        return "Fulltime | Mã: " + getManv() + ", Họ tên: " + getTen() +
        ", Email: " + getEmail() + ", Lương CB: " + getLuongcb() +
                ", Phụ cấp: "+ phucap +", Lương thực nhận: " + tinhluong();
    }
}
