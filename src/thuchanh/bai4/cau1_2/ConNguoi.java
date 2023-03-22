package thuchanh.bai4.cau1_2;

import java.util.Scanner;

public class ConNguoi {

    String hoTen;
    String namSinh;

    public ConNguoi() { }

    public ConNguoi(String hoTen, String namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("- Nhập năm sinh: ");
        namSinh = sc.nextLine();
    }

    public void output() {
        System.out.print("- " + hoTen + ", sinh năm " + namSinh);
    }
}
