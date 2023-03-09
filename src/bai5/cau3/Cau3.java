package bai5.cau3;

public class Cau3 {

    public static void main(String[] args) {
        PhongBanKhoa pbk01 = new PhongBanKhoa("PBK01", "Khoa CNTT");

        HocVien hv01 = new HocVien("Duy", "2003", 4, 5, 2);
        hv01.xuat();

        NhanVien nv01 = new NhanVien("Dũng", "2003", 250, "12/3/2001", pbk01);
        nv01.xuat();
    }
}
