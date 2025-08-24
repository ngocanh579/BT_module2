package Product;

import java.io.*;
import java.util.Scanner;

public class AddProduct {
    public static void addNewProduct() {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin sản phẩm
        System.out.print("Nhập mã sản phẩm: ");
        String id = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());

        Product p = new Product(id, name, price);

        // Ghi vào file products.txt (append)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("products.txt", true))) {
            bw.write(p.toString());
            bw.newLine();

            Logger.log("Added", p.toString());

            // Tạo bản sao lưu sau khi thêm
            new Thread(new BackupTask("products.txt")).start();

            System.out.println("Thêm thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }
}
