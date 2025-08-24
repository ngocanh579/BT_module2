package Product;
import Product.SearchProduct;
import Product.UpdateProduct;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String importFile = "import.txt";
        String productFile = "products.txt";

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Tìm kiếm sản phẩm");
            System.out.println("3. Cập nhật giá sản phẩm");
            System.out.println("4. Xoá sản phẩm");
            System.out.println("5. Nhập từ file (Thread)");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {
                case 1:
                    AddProduct.addNewProduct(); break;
                case 2:
                    System.out.print("Nhập từ khoá: ");
                    SearchProduct.searchByName(sc.nextLine()); break;
                case 3:
                    UpdateProduct.updatePrice(); break;
                case 4:
                    System.out.print("Nhập mã sản phẩm cần xoá: ");
                    DeleteProduct.deleteById(sc.nextLine()); break;
                case 5:
                    Thread importThread = new Thread(new ImportTask(importFile, productFile));
                    importThread.start(); break;
                case 0:
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Chọn sai, vui lòng thử lại.");
            }
        }
    }
}

