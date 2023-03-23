package thuchanh.bai5.cau3;

import java.util.Scanner;

public class NVQuanLy extends NhanVienCLC {

    double phuCapCV;

    public NVQuanLy() { }

    public NVQuanLy(String ten, String namSinh, double luong, String ngayNhanViec,
                    PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao, double phuCapCV) {
        super(ten, namSinh, luong, ngayNhanViec, pbk, trinhDo, nganh, noiDaoTao);
        this.phuCapCV = phuCapCV;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập họ tên: ");
        ten = sc.nextLine();
        System.out.print("- Nhập năm sinh: ");
        namSinh = sc.nextLine();
        System.out.print("- Nhập lương: ");
        luong = sc.nextDouble();
        sc.nextLine();
        System.out.print("- Nhập ngày nhận việc: ");
        ngayNhanViec = sc.nextLine();
        pbk = new PhongBanKhoa();
        pbk.input();
        System.out.print("- Nhập trình độ: ");
        trinhDo = sc.nextLine();
        System.out.print("- Nhập ngành: ");
        nganh = sc.nextLine();
        System.out.print("- Nhập nơi đào tạo: ");
        noiDaoTao = sc.nextLine();
        System.out.print("- Nhập phụ cấp công việc: ");
        phuCapCV = sc.nextLong();
    }

    public void xuat() {
        System.out.print("- " + ten + ", sinh năm " + namSinh + ", lương " + luong + "$, nhận vào " + ngayNhanViec +
                         ", phòng ban " + pbk.tenPBK + ".\n" + "\tTrình độ " + trinhDo + ", ngành " + nganh +
                         ", đào tạo tại " + noiDaoTao + ", phụ cấp " + phuCapCV + "$.\n");
    }
}
