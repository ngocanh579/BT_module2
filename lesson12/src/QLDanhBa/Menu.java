package QLDanhBa;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QuanLyDanhBa qldanhba = new QuanLyDanhBa();
        Scanner sc = new Scanner(System.in);
        int luachon =0;
        do{
            System.out.println("\nMenu chính:");
            System.out.println("1. Thêm liên lạc");
            System.out.println("2. Sửa liên lạc");
            System.out.println("3. Xoá liên lạc");
            System.out.println("4. Tìm kiếm liên lạc");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            luachon = sc.nextInt();
            switch(luachon){
                case 1:
                    qldanhba.themlienlac();
                    break;
                case 2:
                    qldanhba.suaLienLac();
                    break;
                case 3:
                    qldanhba.xoaLienLac();
                    break;
                case 4:
                    qldanhba.timKiemLienLac();
                    break;
                case 5:
                    System.out.println("thoat");
                    break;
                default:
                    System.out.println("lua chon khong hop le ! vui long thu lai");
            }
        }while (luachon != 5);
    }
}
