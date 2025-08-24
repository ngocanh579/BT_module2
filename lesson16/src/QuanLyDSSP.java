import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLyDSSP {
    private List<SanPham> danhSachSanPham;
    private final String duongDanFile = "sanpham.txt";

    public QuanLyDSSP() {
        danhSachSanPham = new ArrayList<>();
        loadSanPham();
    }

    private void loadSanPham() {
        try (BufferedReader br = new BufferedReader(new FileReader(duongDanFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String maSP = parts[0];
                String tenSP = parts[1];
                double gia = Double.parseDouble(parts[2]);
                danhSachSanPham.add(new SanPham(maSP, tenSP, gia));
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    public void themSanPham(SanPham sanPham) {
        danhSachSanPham.add(sanPham);
        luuSanPham();
    }

    private void luuSanPham() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(duongDanFile))) {
            for (SanPham sanPham : danhSachSanPham) {
                bw.write(sanPham.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public void hienThiSanPham() {
        System.out.println("Danh sách sản phẩm:");
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println(sanPham);
        }
    }

    public void hienThiSanPhamGiaTu(double gia) {
        System.out.println("Sản phẩm có giá từ " + gia + " trở lên:");
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham.getGia() >= gia) {
                System.out.println(sanPham);
            }
        }
    }

    public void capNhatGiaSanPham(String maSP, double giaMoi) {
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham.getMaSP().equals(maSP)) {
                // Cập nhật giá
                sanPham = new SanPham(maSP, sanPham.getTenSP(), giaMoi);
                luuSanPham();
                System.out.println("Cập nhật giá thành công cho sản phẩm: " + sanPham);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với mã: " + maSP);
    }
}
