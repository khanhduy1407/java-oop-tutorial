package thuchanh.bai4.cau3;

import java.util.Scanner;

public class NVQuanLy extends NhanVienCLC {

    double phuCapCV;

    public NVQuanLy() { }

    public NVQuanLy(String ten, String namSinh, double luong, String ngayNhanViec,
                    PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao, double phuCapCV) {
        super(ten, namSinh, luong, ngayNhanViec, pbk, trinhDo, nganh, noiDaoTao);
        this.phuCapCV = phuCapCV;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        super.input();

        System.out.print("- Nhập phụ cấp công việc: ");
        phuCapCV = sc.nextLong();

        pbk = new PhongBanKhoa();
        pbk.input();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("phụ cấp " + phuCapCV + "$.\n");
    }
}
