package QLDanhBa;

public class DanhBa {
    private String hoTen;
    private String email;

    public DanhBa(String hoTen, String email) {
        this.hoTen = hoTen;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " hoTen : " + hoTen + ", email : " + email;
    }
}
