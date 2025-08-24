package baitaptonghop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CompanyTest {
    @Test
    void TestAddNhanVien() {
        Company cob = new Company();
        nhanvien nhanvien = new Fulltime(1, "<NAME>", "<EMAIL>", 1000000, 10000);
        cob.addNhanVien(nhanvien);
    }
}
  
