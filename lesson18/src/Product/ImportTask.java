package Product;

import java.io.*;
//NHẬP DỮ LIỆU TỪ FILE – Runnable
public class ImportTask implements Runnable {
    private String importFile;
    private String productFile;

    public ImportTask(String importFile, String productFile) {
        this.importFile = importFile;
        this.productFile = productFile;
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(importFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(productFile, true))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                Logger.log("Imported", line);
            }
            System.out.println("Đã nhập dữ liệu xong.");
        } catch (IOException e) {
            System.out.println("Lỗi nhập file: " + e.getMessage());
        }
    }
}
