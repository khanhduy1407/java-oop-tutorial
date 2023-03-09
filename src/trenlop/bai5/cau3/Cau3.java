package trenlop.bai5.cau3;

public class Cau3 {

    public static void main(String[] args) {
        PhongBanKhoa pbk01 = new PhongBanKhoa("PBK01", "Khoa CNTT");
        PhongBanKhoa pbk02 = new PhongBanKhoa("PBK02", "Khoa Sử");
        PhongBanKhoa pbk03 = new PhongBanKhoa("PBK03", "Bệnh viện");

        HocVien hv01 = new HocVien("Duy", "2003", 4, 5, 2);
        hv01.xuat();

        NhanVien nv01 = new NhanVien("Dũng", "2003", 250, "12/3/2001", pbk01);
        nv01.xuat();

        NVQuanLy nvql01 = new NVQuanLy("Hiếu", "1999", 50, "11/2/2000", pbk02,
                                       "Yếu", "Nhà Sử học", "Trường mầm non", 2);
        nvql01.xuat();

        GiaoVien gv01 = new GiaoVien("Trí", "1989", 10, "16/4/2003", pbk03,
                                       "Bệnh nhân", "Siêu nhân", "Trại tâm thần", 7);
        gv01.xuat();
    }
}
