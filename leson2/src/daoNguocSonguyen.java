import java.util.Scanner;

public class daoNguocSonguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so: ");
        int n = sc.nextInt();
        //cach 1
//        if (n <= 0) {
//            System.out.println("Sai! vui long nhap lai ");
//        } else {
//            int soDaoNguoc = 0;
//            while (n >= 1) {
//                int soCuoi = n%10;
//                soDaoNguoc = soDaoNguoc * 10 + soCuoi;
//                n = n / 10;
//            }
//            System.out.println("so dao nguoc la: " + soDaoNguoc);
//            }
        // cach 2
        if (n < 0) {
            System.out.println("Sai! vui long nhap lai ");
        } else {
            String soDaoNguoc = "";
            while (n > 0) {
                int soCuoi = n%10;
                soDaoNguoc  += soCuoi;
                n = n / 10;
            }
            System.out.println("so dao nguoc la: " + soDaoNguoc);
        }

    }
}
