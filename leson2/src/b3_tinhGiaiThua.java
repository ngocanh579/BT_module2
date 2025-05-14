import java.util.Scanner;

public class b3_tinhGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen N: ");
        int n= sc.nextInt();
        int kq = 1;
        for(int i=1; i<=n; i++){
            kq *=i;
        }
        System.out.println("tinh ket qua la: " + kq);
    }
}
