import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TH_hienThiGioHienTai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        System.out.println(date); // Date không hỗ trợ định dạng ngày
        LocalDate day = LocalDate.now();// lấy ngày hiện tại
        System.out.println("hôm nay là : " + day);
        LocalTime time = LocalTime.now();// Lấy giờ hiện tại
        System.out.println("Bây giờ là : " + time);
        LocalDateTime dateTime = LocalDateTime.now();// lấy ngày và giờ hiện tại
        // System.out.println(dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateTime.format(formatter);
        System.out.println("Ngày hôm nay là theo định dạng (dd/MM/yyyy) là :" + formattedDate);
    }
}
