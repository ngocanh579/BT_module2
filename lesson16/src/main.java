import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuanLyDSSP quanLy = new QuanLyDSSP();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========== MENU ==========");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm mới");
            System.out.println("3. Hiển thị sản phẩm có giá từ 200.000 trở lên");
            System.out.println("4. Cập nhật giá sản phẩm");
            System.out.println("0. Thoát");
            System.out.println("==========================");
            System.out.print("Chọn chức năng: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới

            switch (luaChon) {
                case 1:
                    quanLy.hienThiSanPham();
                    break;
                case 2:
                    System.out.print("Nhập mã sản phẩm: ");
                    String maSP = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String tenSP = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double gia = scanner.nextDouble();
                    quanLy.themSanPham(new SanPham(maSP, tenSP, gia));
                    break;
                case 3:
                    quanLy.hienThiSanPhamGiaTu(200000);
                    break;
                case 4:
                    System.out.print("Nhập mã sản phẩm cần cập nhật giá: ");
                    String maSPCapNhat = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double giaMoi = scanner.nextDouble();
                    quanLy.capNhatGiaSanPham(maSPCapNhat, giaMoi);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
