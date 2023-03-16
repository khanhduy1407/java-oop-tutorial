package trenlop.bai6.cau2;

public class Cau2 {

    public static void main(String[] args) {
        NhanVien nvnc01 = new NVNghienCuu("NVNC01", "Duy", "2003", "Tiến Sĩ", 20,
                                  "Trường Stanford", "Cướp", 2000);
        nvnc01.output();

        NhanVien nvql01 = new NVQuanLy("NVQL01", "Dũng", "1999", "Chủ tịch", 200,
                                       "Trường Hogwarts", "Phù thủy", 50000);
        nvql01.output();

        NhanVien nvpv01 = new NVPhucVu("NVPV01", "Trí", "2096", "Dốt", 5);
        nvpv01.output();
    }
}
