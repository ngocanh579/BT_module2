package baitaptonghop;

import java.util.List;

public class Company {
    List<DuAn>duan;
    List<nhanvien>nhanvien;

    public void addDuAn(DuAn a){}

    public List<nhanvien> getNhanvien() {
        return nhanvien;
    }

    public void addNhanVien(nhanvien e){
        System.out.println("mang nha vien dang co " + nhanvien.size());
    }
}
