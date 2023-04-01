package baikt_kt_NguyenKhanhDuy;

import java.util.Scanner;

public class GiaoVien_NguyenKhanhDuy extends NhanVienCLC_NguyenKhanhDuy {

    double thuLaoGD;

    public GiaoVien_NguyenKhanhDuy() { }

    public GiaoVien_NguyenKhanhDuy(String ten, String namSinh, double luong, String ngayNhanViec,
                    PhongBanKhoa_NguyenKhanhDuy pbk, String trinhDo, String nganh, String noiDaoTao, double thuLaoGD) {
        super(ten, namSinh, luong, ngayNhanViec, pbk, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }

    public void input_NguyenKhanhDuy() {
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
        pbk = new PhongBanKhoa_NguyenKhanhDuy();
        pbk.input_NguyenKhanhDuy();
        System.out.print("- Nhập trình độ: ");
        trinhDo = sc.nextLine();
        System.out.print("- Nhập ngành: ");
        nganh = sc.nextLine();
        System.out.print("- Nhập nơi đào tạo: ");
        noiDaoTao = sc.nextLine();
        System.out.print("- Nhập thù lao giảng dạy: ");
        thuLaoGD = sc.nextDouble();

        luong_NguyenKhanhDuy();
    }

    public void output_NguyenKhanhDuy() {
        System.out.print("- " + ten + ", sinh năm " + namSinh + ", lương " + luong + "$, nhận vào " + ngayNhanViec +
                ", phòng ban " + pbk.tenPBK + ".\n" + "\tTrình độ " + trinhDo + ", ngành " + nganh +
                ", đào tạo tại " + noiDaoTao + ", thù lao " + thuLaoGD + "$.\n");
    }

    public void luong_NguyenKhanhDuy() {
        luong += thuLaoGD;
    }
}
