package Product;

import java.io.*;
import java.util.*;

public class UpdateProduct {
    public static void updatePrice() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sản phẩm cần cập nhật: ");
        String id = sc.nextLine();

        System.out.print("Nhập giá mới: ");
        int newPrice = Integer.parseInt(sc.nextLine());

        List<String> updatedList = new ArrayList<>();
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(id + ",")) {
                    String[] parts = line.split(",");
                    String newLine = parts[0] + "," + parts[1] + "," + newPrice;
                    updatedList.add(newLine);

                    Logger.log("Updated price", id + " -> " + newPrice);
                    found = true;
                } else {
                    updatedList.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }

        if (found) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("products.txt"))) {
                for (String l : updatedList) {
                    bw.write(l);
                    bw.newLine();
                }

                new Thread(new BackupTask("products.txt")).start();
                System.out.println("Đã cập nhật và sao lưu.");
            } catch (IOException e) {
                System.out.println("Lỗi ghi file: " + e.getMessage());
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm cần cập nhật.");
        }
    }
}
