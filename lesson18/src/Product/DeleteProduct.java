package Product;

import java.io.*;
import java.util.*;

public class DeleteProduct {
    public static void deleteById(String idToDelete) {
        List<String> kept = new ArrayList<>();
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(idToDelete + ",")) {
                    found = true;
                    Logger.log("Removed", idToDelete);
                } else {
                    kept.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }

        if (found) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("products.txt"))) {
                for (String l : kept) {
                    bw.write(l);
                    bw.newLine();
                }
                new Thread(new BackupTask("products.txt")).start();
                System.out.println("Đã xoá và sao lưu.");
            } catch (IOException e) {
                System.out.println("Lỗi ghi file: " + e.getMessage());
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm để xoá.");
        }
    }
}
