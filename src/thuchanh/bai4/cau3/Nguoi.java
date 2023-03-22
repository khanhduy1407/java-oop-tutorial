package thuchanh.bai4.cau3;

import java.util.Scanner;

public class Nguoi {

    String ten;
    String namSinh;

    public Nguoi() { }

    public Nguoi(String ten, String namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập họ tên: ");
        ten = sc.nextLine();
        System.out.print("- Nhập năm sinh: ");
        namSinh = sc.nextLine();
    }

    public void xuat() {
        System.out.print("- " + ten + ", sinh năm " + namSinh + ", ");
    }
}
