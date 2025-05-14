import java.util.Scanner;

public class TH_tinhChiSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap tháng: ");
        int thang = Integer.parseInt(sc.nextLine());
        System.out.print("nhap năm: ");
        int year = Integer.parseInt(sc.nextLine());
        boolean isleapyear = isyear(year);
        // kiểm tra sô ngày trong tháng
        String isdaymonth;
        switch (thang) {
            case 2:
                if (isyear(year)) {
                    isdaymonth = "29";
                } else {
                    isdaymonth = "28";
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                isdaymonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                isdaymonth = "30";
            default:
                isdaymonth = "";
                break;
        }
        if (!isdaymonth.equals("")) {
            System.out.printf("Tháng '%d' năm %d có %s ngày\n", thang, year, isdaymonth);
        } else {
            System.out.print("Nhập tháng không hợp lệ!\n"); // Tháng không hợp lệ
        }

        if (isleapyear) {
            System.out.println("Năm " + year + " là năm nhuận.");
        } else {
            System.out.println("Năm " + year + " không phải là năm nhuận.");
        }
    }

    // kiểm tra năm nhuận
    public static boolean isyear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
