package Product;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//TẠO LỚP Logger – ghi log vào history.log
public class Logger {
    // Ghi log thao tác	Ghi vào history.log || chức năng : mỗi lần thêm/xoá/cập nhật || dùng bằng : FileWriter + append
    public static void log(String action, String data) {
        try (FileWriter fw = new FileWriter("history.log", true)) {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            fw.write("[" + time + "] " + action + ": " + data + "\n");
        } catch (IOException e) {
            System.out.println("Lỗi ghi log: " + e.getMessage());
        }
    }
}

