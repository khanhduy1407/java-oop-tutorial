package thuchanh.bai5.cau1_2;

import java.util.ArrayList;

public class HocVien {

    ArrayList<NhanVien> dsnv;

    public HocVien() {
        dsnv = new ArrayList<>();
    }

    public void themNV(NhanVien nv) {
        dsnv.add(nv);
    }

    public double tongLuongCacNV() {
        double tongLuong = 0;
        for (NhanVien nv : dsnv) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }
}
