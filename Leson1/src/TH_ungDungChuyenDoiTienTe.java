import java.util.Scanner;

public class TH_ungDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vnd = 23000;
        System.out.print("nhap tien usd : ");
        double usd = scanner.nextDouble();
        double tien_vnd = usd * vnd;
        System.out.println(tien_vnd);
    }
}
