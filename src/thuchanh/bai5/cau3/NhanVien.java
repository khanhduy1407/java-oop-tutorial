package thuchanh.bai5.cau3;

public abstract class NhanVien extends Nguoi {

    double luong;
    String ngayNhanViec;
    PhongBanKhoa pbk;

    public NhanVien() { }

    public NhanVien(String ten, String namSinh, double luong, String ngayNhanViec, PhongBanKhoa pbk) {
        super(ten, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.pbk = pbk;
    }

    public abstract void input();

    public abstract void xuat();
}
