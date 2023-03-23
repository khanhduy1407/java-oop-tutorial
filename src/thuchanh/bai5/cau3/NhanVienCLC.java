package thuchanh.bai5.cau3;

import java.util.Scanner;

public abstract class NhanVienCLC extends NhanVien {

    String trinhDo;
    String nganh;
    String noiDaoTao;

    public NhanVienCLC() { }

    public NhanVienCLC(String ten, String namSinh, double luong, String ngayNhanViec,
                       PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao) {
        super(ten, namSinh, luong, ngayNhanViec, pbk);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    public abstract void input();

    public abstract void xuat();
}
