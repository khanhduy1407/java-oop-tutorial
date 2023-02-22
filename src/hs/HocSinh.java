package hs;

import java.util.Scanner;

public class HocSinh {

    String maSV;
    String hoTen;
    double diemTB;

    public HocSinh() {}

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
