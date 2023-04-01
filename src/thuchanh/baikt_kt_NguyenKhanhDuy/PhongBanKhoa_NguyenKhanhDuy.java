package baikt_kt_NguyenKhanhDuy;

import java.util.Scanner;

public class PhongBanKhoa_NguyenKhanhDuy {

    String maPBK;
    String tenPBK;

    public PhongBanKhoa_NguyenKhanhDuy() { }

    public PhongBanKhoa_NguyenKhanhDuy(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }

    public void input_NguyenKhanhDuy() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập mã PBK: ");
        maPBK = sc.nextLine();
        System.out.print("- Nhập tên PBK: ");
        tenPBK = sc.nextLine();
    }

    public void output_NguyenKhanhDuy() {
        System.out.print(", ban " + maPBK + "_" + tenPBK + ".\n");
    }
}
