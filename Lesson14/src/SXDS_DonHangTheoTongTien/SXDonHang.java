package SXDS_DonHangTheoTongTien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SXDonHang {
    private ArrayList<Order> orders; // Danh sách đơn hàng
    private Scanner sc; // Đối tượng Scanner để nhập dữ liệu

    public SXDonHang() {
        orders = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    // Nhập dữ liệu đơn hàng
    public void nhapDuLieu() {

        orders.add(new Order("DH001", 500.0));
        orders.add(new Order("DH002", 1500.0));
        orders.add(new Order("DH003", 750.0));
        orders.add(new Order("DH004", 1200.0));
        orders.add(new Order("DH005", 300.0));

        // Cho phép người dùng nhập thêm đơn hàng
        System.out.print("Bạn có muốn thêm đơn hàng mới không? (y/n): ");
        String choice = sc.nextLine();
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Nhập mã đơn hàng: ");
            String orderId = sc.nextLine();
            System.out.print("Nhập tổng tiền: ");
            double totalAmount = sc.nextDouble();
            sc.nextLine(); // Đọc dòng mới
            orders.add(new Order(orderId, totalAmount));
            System.out.print("Bạn có muốn thêm đơn hàng mới không? (y/n): ");
            choice = sc.nextLine();
        }
    }

    // Sắp xếp danh sách đơn hàng theo tổng tiền giảm dần
    public void sapXepDonHangTheoTienGiamDan() {
        Collections.sort(orders, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Double.compare(o2.getTotalAmount(), o1.getTotalAmount()); // Sắp xếp giảm dần
            }
        });
    }

    // Tìm kiếm đơn hàng có tổng tiền cao nhất
    public Order timKiemDonHangTheoTienMax() {
        return Collections.max(orders, Comparator.comparingDouble(Order::getTotalAmount));
    }

    // In danh sách đơn hàng
    public void inDanhSachDonHang() {
        System.out.println("Danh sách đơn hàng sau khi sắp xếp :");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        SXDonHang sxDonHang = new SXDonHang();
        sxDonHang.nhapDuLieu(); // Nhập dữ liệu
        sxDonHang.sapXepDonHangTheoTienGiamDan(); // Sắp xếp
        sxDonHang.inDanhSachDonHang(); // In danh sách sau khi sắp xếp

        // Tìm kiếm đơn hàng có tổng tiền cao nhất
        Order maxOrder = sxDonHang.timKiemDonHangTheoTienMax();
        System.out.println("Đơn hàng có tổng tiền cao nhất: " + maxOrder);
    }
}
