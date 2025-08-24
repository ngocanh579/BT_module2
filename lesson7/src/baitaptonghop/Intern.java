package baitaptonghop;

public class Intern extends nhanvien {
    private String nguoiHuongDan;
    @Override
    public double tinhluong() {
        return getLuongcb();
    }
    public Intern(int manv, String ten, String email, double luongcb, String nguoiHuongDan) {
        super(manv, ten, email, luongcb);
        this.nguoiHuongDan = nguoiHuongDan;
    }

    @Override
    public String toString() {
        return "Intern | Mã: " + getManv() + ", Họ tên: " + getTen() +
                ", Email: " + getEmail() + ", Mentor: " + nguoiHuongDan +
                ", Lương thực nhận: " + tinhluong();
    }
}
