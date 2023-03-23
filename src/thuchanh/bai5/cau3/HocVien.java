package thuchanh.bai5.cau3;

import java.util.Scanner;

public class HocVien extends Nguoi {

    double diem1;
    double diem2;
    double diem3;

    public HocVien() { }

    public HocVien(String ten, String namSinh, double diem1, double diem2, double diem3) {
        super(ten, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập họ tên: ");
        ten = sc.nextLine();
        System.out.print("- Nhập năm sinh: ");
        namSinh = sc.nextLine();
        System.out.print("- Nhập điểm 1: ");
        diem1 = sc.nextDouble();
        System.out.print("- Nhập điểm 2: ");
        diem2 = sc.nextDouble();
        System.out.print("- Nhập điểm 3: ");
        diem3 = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("- " + ten + ", sinh năm " + namSinh + ", điểm 1: " + diem1 + ", điểm 2: " + diem2 +
                           ", điểm 3: " + diem3 + ".");
    }
}
