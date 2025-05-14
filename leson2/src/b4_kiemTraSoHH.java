import java.util.Scanner;

public class b4_kiemTraSoHH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen N: ");
        int n = sc.nextInt();
        int tong = 0;
        if (n < 0) {
            System.out.println("Sai! vui long nhap lai ");
        } else {
            for (int i =1; i <= n; i++) {
                if(n%i == 0) tong += i;
            }
        }
        if(tong == n) System.out.println("so hoan hao la: " + n);
        else System.out.println(n + "khong la so  hoan hao: ");
    }
}
