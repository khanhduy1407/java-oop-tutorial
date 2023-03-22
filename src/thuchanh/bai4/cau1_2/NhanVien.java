package thuchanh.bai4.cau1_2;

import java.util.Scanner;

public class NhanVien extends ConNguoi {

    long luong;
    String ngayNhanViec;
    PhongBanKhoa pbk;

    public NhanVien() { }

    public NhanVien(String hoTen, String namSinh, long luong, String ngayNhanViec, PhongBanKhoa pbk) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.pbk = pbk;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        super.input();

        System.out.print("- Nhập lương: ");
        luong = sc.nextLong();
        sc.nextLine();
        System.out.print("- Nhập ngày nhận việc: ");
        ngayNhanViec = sc.nextLine();

        pbk = new PhongBanKhoa();
        pbk.input();
    }

    @Override
    public void output() {
        super.output();
        System.out.print(", lương " + luong + "$, nhận việc vào " + ngayNhanViec);
        pbk.output();
    }
}
