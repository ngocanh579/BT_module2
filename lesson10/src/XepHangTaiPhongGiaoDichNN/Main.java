package XepHangTaiPhongGiaoDichNN;

import java.util.*;

public class Main {
    static LinkedList<Customer> hangDoi = new LinkedList<>();
    static List<QuayGiaoDich> danhSachQuay = new ArrayList<>();
    static int soThuTuHienTai = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //khoi tao , mac dinh 5 quay deu ban
        for (int i=0; i<5 ; i++){
            System.out.print("ten khach hang " +(i+1)+" : ");
            String tenKH = sc.nextLine();
            Customer khachHang = new Customer(tenKH,soThuTuHienTai++);
            QuayGiaoDich quay = new QuayGiaoDich();
           quay.phucVuKhachHang(khachHang);
            danhSachQuay.add(quay);
        }
        int chon;
        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Thêm 10 khách hàng mới vào hàng đợi");
            System.out.println("2. Quầy xử lý xong → gọi khách tiếp theo");
            System.out.println("3. Hiển thị hàng đợi hiện tại");
            System.out.println("4. Hiển thị trạng thái các quầy");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    themKhachHang();
                    break;
                case 2:
                    xuLyHangDoi();
                    break;
                case 3:
                    hienThiHangDoi();
                    break;
                case 4:
                    hienThiTrangThaiQuay();
                    break;
                case 0:
                    System.out.println("thoat");
                default:
                    System.out.println("chuc nang khong ton tai");
                    break;

            }
        } while(chon!=0);
    }
    public static void themKhachHang(){
        for (int i=0; i<10; i++){
            System.out.print("ten khach hang " +(soThuTuHienTai+1)+": ");
            String tenKH = sc.nextLine();
            hangDoi.addLast(new Customer(tenKH,soThuTuHienTai++));

        }

        System.out.println("Da them 10 khach hang vao hang doi");
        for (Customer khach : hangDoi) {
            System.out.println(khach);
        }
    }
    static void xuLyHangDoi(){
        for(int i=0; i<danhSachQuay.size(); i++){
            QuayGiaoDich quay = danhSachQuay.get(i);
            if(!hangDoi.isEmpty()&& quay.quayBan()){
                Customer khach = hangDoi.pollFirst();
                quay.phucVuKhachHang(khach);
                System.out.println("Quay"+ (i+1)+ "bat dau phuc vu khach hang");
            } else if (quay.quayBan()) {
                quay.ketThucPhucVu();
                System.out.println("Quay"+ (i+1)+ " da ket thuc phuc vu");
            }
        }
    }
    static void hienThiHangDoi(){
        System.out.println("hang doi hien tai la: ");
        if(hangDoi.isEmpty()) System.out.println("hang doi hien tai rong");
        else{
            for (Customer khach : hangDoi) {
                System.out.println(khach);
            }
        }
    }
    static void hienThiTrangThaiQuay(){
        for (int i=0; i<danhSachQuay.size(); i++) {
                QuayGiaoDich quay = danhSachQuay.get(i);
                if(quay.quayBan()){
                    System.out.println("Quay "+ (i+1)+" BAN(phuc vu)");
                }
                else{
                    System.out.println("Quay "+ (i+1)+" RANH");
                }
        }
    }
}
