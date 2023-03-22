package thuchanh.bai4.cau1_2;

import java.util.Scanner;

public class HocVien extends ConNguoi {

    double diem1, diem2, diem3;

    public HocVien() { }

    public HocVien(String hoTen, String namSinh, double diem1, double diem2, double diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        super.input();

        System.out.print("- Nhập điểm 1: ");
        diem1 = sc.nextDouble();
        System.out.print("- Nhập điểm 2: ");
        diem2 = sc.nextDouble();
        System.out.print("- Nhập điểm 3: ");
        diem3 = sc.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.print(", điểm 1: " + diem1 + "đ, điểm 2: " + diem2 + "đ, điểm 3: " + diem3 + "đ.\n");
    }
}
