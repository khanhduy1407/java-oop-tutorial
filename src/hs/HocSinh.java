package hs;

import java.util.Scanner;

public class HocSinh {

    String maSV;
    String hoTen;
    double diemTB;

    public HocSinh() {
        maSV = null;
        hoTen = "NKDuy";
        diemTB = 0;
    }

    public HocSinh(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public HocSinh(HocSinh a) {
        maSV = a.maSV;
        hoTen = a.hoTen;
        diemTB = a.diemTB;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập mã số: ");
        maSV = sc.nextLine();

        System.out.print("- Nhập họ tên: ");
        hoTen = sc.nextLine();

        System.out.print("- Nhập điểm trung bình: ");
        diemTB = sc.nextDouble();
    }

    public void output() {
        System.out.print("- " + maSV + ", " + hoTen + ", " + diemTB + " điểm.\n");
    }
}
