package thuchanh.bai4.cau3;

import java.util.Scanner;

public class PhongBanKhoa {

    String maPBK;
    String tenPBK;

    public PhongBanKhoa() { }

    public PhongBanKhoa(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập mã PBK: ");
        maPBK = sc.nextLine();
        System.out.print("- Nhập tên PBK: ");
        tenPBK = sc.nextLine();
    }

    public void xuat() {
        System.out.print(", ban " + maPBK + "_" + tenPBK + ".\n");
    }
}
