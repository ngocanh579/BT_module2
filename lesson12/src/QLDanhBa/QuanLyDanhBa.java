package QLDanhBa;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class QuanLyDanhBa {
    private HashMap<String,DanhBa> danhba;
    private Scanner sc;
    public QuanLyDanhBa(){
        danhba = new HashMap<>();
        sc = new Scanner(System.in);
    }
    public void themlienlac(){
        System.out.print("Nhap so dien thoai: ");
        String soDienThoai = sc.nextLine();

        if(danhba.containsKey(soDienThoai)){
            System.out.println("so dien thoai da ton tai ");
            String luaChon=sc.nextLine();
            if(!luaChon.equalsIgnoreCase("y")){
                return;
            }
        }
        System.out.print("nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("nhap email: ");
        String email = sc.nextLine();
        danhba.put(soDienThoai,new DanhBa(hoTen,email));
        System.out.println("lien lac da duoc them. ");
    }
    public void suaLienLac(){
        System.out.print("Nhap so dien thoai can sua : ");
        String soDienThoai = sc.nextLine();

        if(!danhba.containsKey(soDienThoai)){
            System.out.println("so dien thoai khong ton tai ");
            return;
        }
        System.out.print("nhap ho ten moi: ");
        String hoTen = sc.nextLine();
        System.out.print("nhap email moi: ");
        String email = sc.nextLine();

        DanhBa db = danhba.get(soDienThoai);
        if(hoTen.isEmpty()){
            db.setHoTen(hoTen);
        }
        if(email.isEmpty()){
            db.setEmail(email);
        }
        System.out.println("lien lac da duoc sua. ");
    }
    public void xoaLienLac(){
        System.out.print("Nhap so dien thoai can xoa : ");
        String soDienThoai = sc.nextLine();
        if (danhba.remove(soDienThoai) != null) {
            System.out.println("lien lac da duoc xoa. !");
        } else {
            System.out.println("so dien thoai khong ton tai !");
        }
    }
    public void timKiemLienLac(){
        System.out.print("nhap tu khoa can tim kiem: ");
        String tuKhoa = sc.nextLine();
        boolean timThay = false;
        for (Map.Entry<String, DanhBa> entry : danhba.entrySet()) {
            if (entry.getValue().getHoTen().contains(tuKhoa) || entry.getValue().getEmail().contains(tuKhoa)) {
                System.out.println("So Dien Thoai: "+ entry.getKey() + " , " + entry.getValue());
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("khong tim thay lien lac nao khop voi tu khoa!");
        }
    }
}

