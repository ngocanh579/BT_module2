package XepHangTaiPhongGiaoDichNN;

public class Customer {
        private int soThuTu;
        private String tenKH;


        public Customer(String tenKH, int soThuTu) {
            this.tenKH = tenKH;
            this.soThuTu = soThuTu;
        }
        public String getTenKH() {
            return tenKH;
        }
        public int getSoThuTu() {
            return soThuTu;
        }

    @Override
    public String toString() {
        return
                "tenKH= " + tenKH + " || " + "soThuTu=" + soThuTu ;
    }
}
