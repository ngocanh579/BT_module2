package XepHangTaiPhongGiaoDichNN;

public class QuayGiaoDich {
    private boolean quayBan;
    private Customer khachDangPhucVu;
    public QuayGiaoDich(){
        quayBan=false;
        khachDangPhucVu=null;
    }
    public boolean quayBan() {
        return quayBan;
    }
    public void phucVuKhachHang(Customer c){
        khachDangPhucVu=c;
        quayBan=true;
    }
    public void ketThucPhucVu(){
        quayBan=false;
        khachDangPhucVu=null;
    }
    public Customer getKhachDangPhucVu() {
        return khachDangPhucVu;
    }
}
