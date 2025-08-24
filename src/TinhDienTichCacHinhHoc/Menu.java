package TinhDienTichCacHinhHoc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=== Menu Tính Diện Tích ===");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác");
            System.out.println("3. Hình tròn");
            System.out.println("0. Thoát");
            System.out.print("Chọn hình: ");
            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("nhập chiều dài: ");
                        double length = sc.nextDouble();
                        System.out.print("nhập chiều rộng: ");
                        double width = sc.nextDouble();
                        Rectangle r = new Rectangle(length, width);
                        System.out.print("Diện tích hình chữ nhật :" + r.area());
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("nhập cạnh đáy: ");
                        double base = sc.nextDouble();
                        System.out.print("nhập chiều cao: ");
                        double height = sc.nextDouble();
                        Triangle t = new Triangle(base, height);
                        System.out.print("Diện tích hình tam giác :" + t.area());
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("nhập bans kính hình tròn: ");
                        double radius = sc.nextDouble();
                        Circle c = new Circle(radius);
                        System.out.print("Diện tích hình Tròn : " + c.area());
                        System.out.println();
                        break;
                    case 0:
                        System.out.println("Thoát chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ ! Chọn lại ");
                        break;
                }
            } catch (InputMismatchException e) {// bắt lỗi khi nhập k phải kiểu số
                System.out.println("Lỗi : Vui lòng nhập đúng số. ");
                sc.next();// xoá dữ liệu không hợp lệ trong bộ nhớ đệm
                choice = -1; // đặt lại lựa chọn để không thoát khỏi vongf lặp
            } catch (IllegalArgumentException e) {// bắt lỗi do constructor ném ra khi dữ liệu logic không hợp lệ
                System.out.println("Lỗi : " + e.getMessage());
                choice = -1;
            }
        } while (choice != 0);
        sc.close();
    }
}

