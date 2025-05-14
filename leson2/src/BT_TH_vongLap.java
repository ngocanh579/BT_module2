import java.util.Scanner;

public class BT_TH_vongLap {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Bai_tap_TH menu = new Bai_tap_TH(); // tạo đối tượng
        int chucNang;
        do {
            System.out.println("==========Menu Chính ========");
            System.out.println("1. Thuc hanh kiem tra so nguyen to");
            System.out.println("2. Thuc hanh Ung dung tinh tien tien lai vay");
            System.out.println("3. Thuc hanh tim so uoc chung lon nhat");
            System.out.println("4. thuc hanh thiet ke menu");
            System.out.println("5. hien thi cac loai hinh");
            System.out.println("6. hien thi 20 so nguyen to dau tien");
            System.out.println("7. hien thi cac so nguyen to nho hon 100");
            System.out.println("0. Thoat");
            System.out.print("chon chuc nang : ");
            chucNang = sc.nextInt();
            switch (chucNang){
                case 1:
                    System.out.println("========== Kiem tra So Nguyen To==========");
                    menu.bai1();
                    break;
                case 2:
                    System.out.println("========== Ung dung Tinh Tien Tien Lai Vay ==========");
                    menu.bai2();
                    break;
                case 3:
                    System.out.println("========== Tim So Uoc Chung Lon Nhat ==========");
                    bai3();
                    break;
                case 4:
                    System.out.println("========== Thiet ke Menu ==========");
                    bai4();
                    break;
                case 5:
                    System.out.println("========== Hien thi cac loai hinh ==========");

                    break;
                case 6:
                    System.out.println("========== Hien thi 20 so nguyen to dau tien ==========");
                    bai6();
                    break;
                case 7:
                    System.out.println("========== Hien thi cac so nguyen to nho hon 100 ==========");
                    bai7();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }

        }while(chucNang != 0);
    }
    public void bai1(){
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        if(n ==0 || n ==1){
            System.out.println( n + " khong phai la so nguyen to");
        }else{
            boolean ktra = true;
            for(int i=2 ; i<=Math.sqrt(n) ; i++){
                if(n % i ==0){
                    ktra = false;
                    break;
                }
            }
            if(ktra) System.out.println(n + " la so nguyen to");
            else System.out.println(n + " khong phai la so nguyen to");
        }
    }
    public void bai2(){
        System.out.print(" So luong tien cho vay: ");
        double soLuongTien = sc.nextDouble();
        System.out.print(" So thang cho vay : ");
        double soThang = sc.nextDouble();
        System.out.print("Ty le lai suat theo thang: ");
        double laiSuat = sc.nextDouble();
        double soTienLai = 0;
        double tongTienPhaiTra = 0;
        for(int i=1 ; i<=soThang ; i++){
            soTienLai += soLuongTien *laiSuat*soLuongTien ;
            tongTienPhaiTra = soLuongTien + soTienLai;

        }
        System.out.printf("Tong so tien phai tra sau %,d thang la : %,d VND\n" , (int)soThang , (long)tongTienPhaiTra);
    }
    public static void bai3(){
        System.out.print("nhap a: ");
        int a = sc.nextInt();
        System.out.print("nhap b: ");
        int b = sc.nextInt();
        int ucln = timUCLN(a,b);
        System.out.print("Uoc chung lon nhat la \n: " + ucln );
    }
    public static int timUCLN(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void bai4(){
        int luachon;
        do{
            System.out.println("=========Menu bai 4==========");
            System.out.println("1. tam giac vuông cạnh trái dưới");
            System.out.println("2. tam giac vuong canh phai dưới");
            System.out.println("0. Thoat");
            luachon = sc.nextInt();
            switch (luachon){
                case 1:
                    System.out.println("------------Bai 4.1------------");
                    bai4_1();
                    break;
                case 2:
                    System.out.println("------------Bai 4.2------------");
                    bai4_2();
                    break;
                case 0:
                    System.out.println("Thoát ");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }

        }
        while(luachon != 0);
    }
    public static void bai4_1(){
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void bai4_2(){
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=0 ; j<=n ; j++){
                if(j<=n-i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void bai6(){
        int dem =0;
        int n = 2 ;
        while(dem < 20){
            boolean ktra = true;
            for(int i=2 ; i<=Math.sqrt(n) ; i++){
                if(n % i ==0){
                    ktra = false;
                    break;
                }
            }
            if(ktra) { System.out.print(n + " "); dem++;}
            n++;
        }
        System.out.println();
    }
    public static void bai7() {
        System.out.print("cac so nguyen to nho hon 100 la:  ");
        for (int n = 2; n <100; n++) {
            boolean ktra = true;
            for (int i =2 ; i<= Math.sqrt(n); i++) {
                if (n % i == 0){
                    ktra = false;
                    break;
                }
            }
            if (ktra) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
