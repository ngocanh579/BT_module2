import java.util.Scanner;

public class bt1_nhapVaHienThiDSDiem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int chucNang;
        do {
            System.out.println("==========Menu Chính ========");
            System.out.println("1. nhap va hien thi danh sach diem");
            System.out.println("2. tinh toan thong ke diem");
            System.out.println("3. thong ke diem");
            System.out.println("4. phan loai hoc luc");
            System.out.println("0. Thoat");
            System.out.print("chon chuc nang : ");
            chucNang = sc.nextInt();
            switch (chucNang){
                case 1:
                    System.out.println("========== bai 1==========");
                   bai1();
                    break;
                case 2:
                    System.out.println("========== bai 2 ==========");
                    bai2();
                    break;
                case 3:
                    System.out.println("========== bai 3==========");
                    bai3();
                    break;
                case 4:
                    System.out.println("========== bai 4 ==========");
                    bai4();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }

        }while(chucNang != 0);
    }
    static final int max = 100;
    static float[] diem = new float[max];
    static int  n = 0 ;
    public static void bai1(){

        System.out.print("nhap so luong sinh vien (toi da 100) : ");
         n = sc.nextInt();
        if(n<1 || n > 100){
            System.out.println("so luong sinh vien khong hop le!");
        }
        // nhap diem cho tung sinh vien
        for(int i = 0; i<n; i++){
            System.out.print("nhap diem sinh vien thu " + (i+1) + " : ");
            diem[i] = sc.nextFloat();
        }
        // in danh sach diem
        System.out.println("danh sach diem sinh vien : ");
        for (int i = 0; i < n; i++) {
            System.out.println("sinh vien thu " + (i+1) + " : " + diem[i] + "");
        }
    }
    public static void bai2(){

        float tong =0 ;
        for(int i =0 ; i<n ; i++){
            tong += diem[i];
        }

        float tb = tong/n;
        System.out.printf("Diem trung binh cua tat ca sinh vien la %.2f: ", tb);
        System.out.println();
        int dem =0;
        for(int i =0 ; i<n ; i++){
            if(diem[i] >= 5){
                dem++;
            }
        }
        System.out.println("so sinh vien dat  co diem >= 5 la : " + dem);
        float max = diem[0];
        for(int i =1; i<n; i++){
            if(diem[i]>max) max = diem[i];
        }
        System.out.print("sinh vien co diem cao nhat la: " + max);
        System.out.println();

        float min = diem[0];
        for(int i =1; i<n; i++){
            if(diem[i] < min) min = diem[i];
        }
        System.out.print("sinh vien co diem thap  nhat la: " + min);
        System.out.println();
    }
    public static void bai3(){
        System.out.print("nhap diem can tim kiem: ");
        float diemCanTim = sc.nextFloat();
        for(int i =0; i<n; i++){
            if (diem[i] == diemCanTim){
                System.out.println("sinh vien thu " + (i+1) + " co diem la: " + diem[i]);
            }
            else
                System.out.println("khong co diem co the tim kiem");
        }
    }
    public static void bai4(){
        System.out.println("phan loai hoc luc: ");
        String hocLuc = "";
        for(int i =0; i<n; i++){
            if(diem[i] >= 8){
                hocLuc = "gioi";
            }else if(diem[i] >= 6.5){
                hocLuc = "kha";
            }else if(diem[i] >= 5){
                hocLuc = "trung binh";
            }else
                hocLuc = "yeu";
            System.out.println("sinh vien thu " + (i+1) + " co diem la: " + diem[i] + " la hoc luc " + hocLuc );
        }

    }
}
