package Product;

import java.io.*;

public class SearchProduct {
    public static void searchByName(String keyword) {
        keyword = keyword.toLowerCase();

        try (BufferedReader br = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(keyword)) {
                    System.out.println("Tìm thấy: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi tìm kiếm: " + e.getMessage());
        }
    }
}
