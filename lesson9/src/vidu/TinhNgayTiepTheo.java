package vidu;
public class TinhNgayTiepTheo {
    public static int[] tinhNgayTiepTheo(int ngay, int thang, int nam) {
        int soNgayTrongThang = laySoNgayTrongThang(thang, nam);

        if (ngay < soNgayTrongThang) {
            ngay++;
        } else {
            ngay = 1;
            if (thang == 12) {
                thang = 1;
                nam++;
            } else {
                thang++;
            }
        }
        return new int[]{ngay, thang, nam};
    }

    private static int laySoNgayTrongThang(int thang, int nam) {
        switch (thang) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (laNamNhuan(nam)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    private static boolean laNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }
}

