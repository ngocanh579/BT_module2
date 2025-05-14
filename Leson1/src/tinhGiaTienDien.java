import java.util.Scanner;

public class tinhGiaTienDien {
    public static void main(String[] args) {
        System.out.print(" so dien da su dung trong thang: ");
        Scanner sc = new Scanner(System.in);
        int dien = sc.nextInt();
        double tong = 0;
        double giaMuc1 = 1.800;
        double giaMuc2 = 2.300;
        double giaMuc3 = 3.000;

        if(dien>0 && dien <= 50 ){
            tong =dien * giaMuc1;
        }else if(dien>50 && dien <= 100){
            tong =dien * giaMuc1;
            tong += (dien-50) * giaMuc2;
        }else {
            tong = 50 * giaMuc1;// 50 so dau
            tong += 50 * giaMuc2;// 50 so tiep
            tong += (dien - 100) * giaMuc3;
        }

        System.out.printf("tien dien phai tra la : %.2f VND\n", tong);
    }
}
