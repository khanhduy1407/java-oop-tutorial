package bai5.cau3;

public class NhanVien extends Nguoi {

    double luong;
    String ngayNhanViec;
    PhongBanKhoa pbk;

    public NhanVien(String ten, String namSinh, double luong, String ngayNhanViec, PhongBanKhoa pbk) {
        super(ten, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.pbk = pbk;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("lương " + luong + "$, nhận vào " + ngayNhanViec + ", phòng ban " + pbk.tenPBK + ".\n");
    }
}
