package thuchanh.bai4.cau3;

import java.util.Scanner;

public class GiaoVien extends NhanVienCLC {

    double thuLaoGD;

    public GiaoVien() { }

    public GiaoVien(String ten, String namSinh, double luong, String ngayNhanViec,
                    PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao, double thuLaoGD) {
        super(ten, namSinh, luong, ngayNhanViec, pbk, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        super.input();

        System.out.print("- Nhập thù lao giảng dạy: ");
        thuLaoGD = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("thù lao " + thuLaoGD + "$.\n");
    }
}
