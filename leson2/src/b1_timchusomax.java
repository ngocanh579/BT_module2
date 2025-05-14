import java.util.Scanner;

public class b1_timchusomax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen duong: ");
        int songuyen = sc.nextInt();
        int n = songuyen;
        int max=0;
        while (n > 0) {
            int soCuoi = n%10;
            if(soCuoi>max) max = soCuoi;
            n = n / 10;
        }
        System.out.println("so nhat la: " + max);
    }
}
