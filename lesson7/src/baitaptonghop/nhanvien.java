package baitaptonghop;
// nên dùng abstract
public abstract class nhanvien {
    private int manv;
    private String ten;
    private String email;
    private double luongcb;
    public int getManv() {
        return manv;
    }
    public nhanvien(int manv, String ten, String email, double luongcb) {
        this.manv = manv;
        this.ten = ten;
        this.email = email;
        this.luongcb = luongcb;
    }
    public String getTen() {
        return ten;
    }
    public String getEmail() {
        return email;
    }
   public double getLuongcb() {
        return luongcb;
    }
    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }
    public abstract double tinhluong();

    @Override
    public String toString() {
        return "nhanvien{" +
                "manv=" + manv +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                ", luongcb=" + luongcb +
                '}';
    }


}
