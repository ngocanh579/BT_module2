import java.util.Scanner;

public class TH_suDungToanTu {
    public static void main(String[] args) {
        // toán tử số
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số b: ");
        int b = Integer.parseInt(sc.nextLine());
        int luachon;
        do {
            System.out.println("-----------------------------Menu--------------------------------------");
            System.out.println("1. Tính tổng a+b");
            System.out.println("2. Tính hiệu a-b");
            System.out.println("3. Tính tích a*b");
            System.out.println("4. Tính thương a/b");
            System.out.println("5. Tính a mod b");
            System.out.println("6. Tính chu vi và diện tích hình vuông");
            System.out.println("7. Tính chu vi và diện tích hình tròn");
            System.out.println("8. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("9. Tính chu vi và diện tích hình tam giác");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            System.out.println("---------------------------------------------------------------------");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    int x = a + b;
                    System.out.println("Tỏng của 2 số là : " + x);
                    break;
                case 2:
                    int y = a - b;
                    System.out.println("Hiệu của 2 số là : " + y);
                    break;
                case 3:
                    int z = a * b;
                    System.out.println("Tích của 2 số là : " + z);
                    break;
                case 4:
                    if (b != 0) {
                        int k = a / b;
                        System.out.println("Thương của 2 số là : " + k);
                    } else {
                        System.out.println("Lỗi chia cho 0");
                    }
                    break;
                case 5:
                    if (b != 0) {
                        int w = a % b;
                        System.out.println("Phép chia 2 số lấy dư là : " + w);
                    } else {
                        System.out.println("Lỗi chia cho 0");
                    }
                case 6:
                    int chuViVuong = 4 * a;
                    System.out.println("Chu vi hình vuông là : " + chuViVuong);
                    int dienTichVuong = a * a;
                    System.out.println("Diện tích hình vuông là : " + dienTichVuong);
                    break;
                case 7:
                    double chuViHinhTron = 2 * Math.PI * a;
                    System.out.println("Chu vi hình tròn là : " + chuViHinhTron);
                    double dienTichHinhTron = Math.PI * a * a;
                    System.out.println("Diện tích hình tròn là : " + dienTichHinhTron);
                    break;
                case 8:
                    int chuViHinhChuNhat = 2 * (a + b);
                    System.out.println("Chu vi hình chữ nhật là : " + chuViHinhChuNhat);
                    int dienTichHinhChuNhat = a * b;
                    System.out.println("Diện tích hình chữ nhật là : " + dienTichHinhChuNhat);
                    break;
                case 9:
                    System.out.print("nhập số c : ");
                    int c = Integer.parseInt(sc.nextLine());
                    int chuViHinhTamGiac = a + b + c;
                    float s = (a + b + c) / 2;
                    System.out.println("Chu vi hình tam giác là : " + chuViHinhTamGiac);
                    float DienTichHinhTamGiac = (float) (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                    System.out.println("Diện tích hình tam giác là : " + DienTichHinhTamGiac);
                    break;
                case 0:
                    System.out.println("Chào tạm biệt");
                    break;
                default:
                    break;
            }
        } while (luachon != 0);
    }
}
