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

    public void input() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("- Nhập mã số: ");
//        maSV = sc.nextLine();
//
//        System.out.print("- Nhập họ tên: ");
//        hoTen = sc.nextLine();
//
//        System.out.print("- Nhập điểm trung bình: ");
//        diemTB = sc.nextDouble();
    }

    public void input(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public void input(HocSinh obj) {
        maSV = obj.maSV;
        hoTen = obj.hoTen;
        diemTB = obj.diemTB;
    }

    public void output() {
        System.out.print("- " + maSV + ", " + hoTen + ", " + diemTB + " điểm.\n");
    }
}
