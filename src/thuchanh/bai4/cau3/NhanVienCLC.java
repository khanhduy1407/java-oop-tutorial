package thuchanh.bai4.cau3;

import java.util.Scanner;

public class NhanVienCLC extends NhanVien {

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

    public void input() {
        Scanner sc = new Scanner(System.in);

        super.input();

        System.out.print("- Nhập trình độ: ");
        trinhDo = sc.nextLine();
        System.out.print("- Nhập ngành: ");
        nganh = sc.nextLine();
        System.out.print("- Nhập nơi đào tạo: ");
        noiDaoTao = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("\tTrình độ " + trinhDo + ", ngành " + nganh + ", đào tạo tại " + noiDaoTao + ", ");
    }
}
