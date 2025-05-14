import java.util.Scanner;

public class TH_tinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chi so can nang: ");
        float canNang = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap vao chi so chieu cao: ");
        float chieuCao = Float.parseFloat(sc.nextLine());
        // float bmi = canNang / chieuCao * chieuCao;
        float bmi = canNang / (float) Math.pow(chieuCao, 2);
        if (bmi <= 18) {
            System.out.printf("BMI = %.2f , phan loai la : UnderWeight", bmi);
        } else if (bmi < 25) {
            System.out.printf("BMI = %.2f , phan loai la : Normal", bmi);
        } else if (bmi < 30) {
            System.out.printf("BMI = %.2f , phan loai la : OverWeight", bmi);
        } else {
            System.out.printf("BMI = %.2f , phan loai la : Obese", bmi);
        }
    }
}
