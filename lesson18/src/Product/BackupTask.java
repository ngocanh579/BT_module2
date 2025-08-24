package Product;

import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//SAO LƯU FILE – Runnable
public class BackupTask implements Runnable {
    private String sourceFile;

    public BackupTask(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void run() {
        try {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            String backupFile = "products_backup_" + time + ".txt";
            Files.copy(Paths.get(sourceFile), Paths.get(backupFile), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Đã sao lưu vào: " + backupFile);
        } catch (Exception e) {
            System.out.println("Lỗi sao lưu: " + e.getMessage());
        }
    }
}
