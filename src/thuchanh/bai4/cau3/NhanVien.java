package thuchanh.bai4.cau3;

import java.util.Scanner;

public class NhanVien extends Nguoi {

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

    public void input() {
        Scanner sc = new Scanner(System.in);

        super.input();

        System.out.print("- Nhập lương: ");
        luong = sc.nextDouble();
        sc.nextLine();
        System.out.print("- Nhập ngày nhận việc: ");
        ngayNhanViec = sc.nextLine();

        pbk = new PhongBanKhoa();
        pbk.input();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("lương " + luong + "$, nhận vào " + ngayNhanViec + ", phòng ban " + pbk.tenPBK + ".\n");
    }
}
