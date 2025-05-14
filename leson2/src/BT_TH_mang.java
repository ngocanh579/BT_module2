import java.util.ArrayList;
import java.util.Scanner;

public class BT_TH_mang {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int luachon;
        do{
            System.out.println("==========Menu chinh==========");
            System.out.println("1. Đảo ngược các phần tử của mảng");
            System.out.println("2. Tìm giá trị trong mảng");
            System.out.println("3. Tìm giá trị lớn nhất trong mảng");
            System.out.println("4. chương trình chuyển đổi nhiệt độ");
            System.out.println("5. Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức");
            System.out.println("6. BT xóa phần tử khỏi mảng");
            System.out.println("7. BT Thêm phần tử vào mảng");
            System.out.println("8. BT Gộp mảng");
            System.out.println("9. BT Tìm phần tử lớn nhất trong mảng 2 chiều");
            System.out.println("10. BT Tìm giá trị nhỏ nhất trong mảng");
            System.out.println("0. Thoát ");
            System.out.print("nhap lua chon: ");
            luachon = sc.nextInt();
            switch (luachon){
                case 1:
                    System.out.println("========== Bai 1 =========");
                    bai1();
                    break;
                case 2:
                    System.out.println("========== Bai 2 =========");
                    bai2();
                    break;
                case 3:
                    System.out.println("========== Bai 3 =========");
                    bai3();
                    break;
                case 4:
                    System.out.println("========== Bai 4 =========");
                    bai4();
                    break;
                case 5:
                    System.out.println("========== Bai 5 =========");
                    bai5();
                    break;
                case 6:
                    System.out.println("========== Bai 6 =========");
                    bai6();
                    break;
                case 7:
                    System.out.println("========== Bai 7 =========");
                    bai7();
                    break;

            }
        }
        while(luachon != 0);
    }
    public static void bai1(){
        // nhập số phần tử cho mảng
        System.out.print("nhap so luong phan tu cho mang: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        // nhập phần tử cho mảng
        for (int i =0 ; i< n ; i++){
            System.out.print("nhap phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        }
        //in phần tử ban đầu sau khi nhập
        System.out.print("mang truoc khi dao: ");
        for (int i =0 ; i < n ; i++){
            System.out.print( a[i] + " ");
        }
        System.out.print("\nmảng sau khi đảo ngược: ");
        for (int i =n-1 ; i>=0 ; i--){
            System.out.print( a[i] + " ");
        }
        System.out.println();
    }
    public static void bai2(){
        String[] st ={"an","hien","nguyen","dao"};
        System.out.print("nhap ten hoc sinh can tim:");sc.nextLine();
        String ten = sc.nextLine();
        boolean tim = false;
        for(int i =0; i< st.length; i++){
            if(ten.equals(st[i])){
                System.out.print("hoc sinh can tim la : " + ten);
                tim = true;
                break;
            }
        }
        if(!tim) System.out.print(ten+": hoc sinh can tim khong ton tai");
        System.out.println();
    }
    public static void bai3(){
        System.out.print("nhap so luong phan tu: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("nhap tung phan tu: ");
        for(int i =0; i<n; i++){
            System.out.print("phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        }
        System.out.print("\nmang sau khi nhap la: ");
        for(int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int max = a[0];
        for(int i =1; i<n; i++){
            if(a[i]>max) max = a[i];
        }
        System.out.print("\nphan tu lon nhat la: " + max);
    }
    public static void bai4(){
        int chon ;
        do {
            System.out.println("---------Menu Bai 4---------");
            System.out.println("1. chuyen doi C -> F");
            System.out.println("2. chuyen soi F-> C");
            System.out.println("0. thoat");
            System.out.print("nhap lua chon : ");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println("========== Bai 4.1 =========");
                    System.out.print("nhap do C: ");
                    double c = sc.nextDouble();
                    System.out.printf("chuyen doi C -> F la: %.2f°F%n" , chuyendoiCtoF(c));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("========== Bai 4.2 =========");
                    System.out.print("nhap do F: ");
                    double f = sc.nextDouble();
                    System.out.print("chuyen doi F -> C" + chuyendoiFtoC(f) +"°C");
                    System.out.println();
                case 0:
                    System.out.println("========== Thoat Bai 4 =========");
                    break;
                default:
                    System.out.println("========== Luu chon sai =========");
                    break;
            }
        }while (chon != 0);
    }
    public static  double chuyendoiFtoC(double c){
        return (c*9.0/5)+32;
    }
    public static double chuyendoiCtoF(double f){
        return (f-32)*5.0/9;
    }
    public static void bai5(){
        System.out.print("nhap so luong phan tu: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("nhap tung phan tu: ");
        for(int i =0; i<n; i++){
            System.out.print("phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        }
        System.out.print("mang sau khi nhap la: ");
        for(int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        int min = min(a);
        System.out.print("\nphan tu nho nhat la: " + min);
        System.out.println();
    }
    public static int min(int a[]){
        int min = a[0];
        for(int i =1; i<a.length; i++){
            if(a[i]<min) min = a[i];
        }
        return min;
    }
    public static void bai6(){
        System.out.print("nhap so luong phan tu: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("nhap tung phan tu: ");
        for(int i =0; i<n; i++){
            System.out.print("phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<a.length; i++){
            list.add(a[i]);
        }
        System.out.println("Mang sau khi nhap la: " + list);

        System.out.print("nhap phan tu can xoa: ");
        int xoa = sc.nextInt();
        for(int i =0 ; i<list.size(); i++){
            if(list.get(i) == xoa){
                // cach 1
                //list.remove(Integer.valueOf(x));// xoa pha tu dau tien co gia tri = x trong list
                //cach 2
                list.removeIf(x -> x == xoa);
                break;
            }
        }
        System.out.println("Mang sau khi xoa la: " + list);

    }
    public static  void bai7(){

    }
}
