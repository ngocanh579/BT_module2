package SXDS_DonHangTheoTongTien;

import java.util.ArrayList;

public class Order {
    private String  id;
    private double totalAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order(String id, double totalAmount) {
        this.id = id;
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

}
