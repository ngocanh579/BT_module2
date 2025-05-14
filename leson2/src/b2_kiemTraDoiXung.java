import java.util.Scanner;

public class b2_kiemTraDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so: ");
        int soBanDau = sc.nextInt();
        int n = soBanDau;
        int soDao =0;
        while (n > 0) {
            int soCuoi = n%10;
            soDao = soDao * 10 + soCuoi;
            n = n / 10;
        }
        if(soBanDau == soDao) System.out.print("so doi xung la: " + soBanDau);
        else System.out.print(soBanDau+" khong phai so doi xung");



    }
}
