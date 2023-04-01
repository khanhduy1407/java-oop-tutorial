package baikt_kt_NguyenKhanhDuy;

import java.util.Scanner;

public class HocVien_NguyenKhanhDuy extends ConNguoi_NguyenKhanhDuy {

    protected double d1, d2, d3;

    public HocVien_NguyenKhanhDuy() { }

    public HocVien_NguyenKhanhDuy(String ten, String namSinh, double d1, double d2, double d3) {
        super(ten, namSinh);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public void input_NguyenKhanhDuy() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập họ tên: ");
        ten = sc.nextLine();
        System.out.print("- Nhập năm sinh: ");
        namSinh = sc.nextLine();
        System.out.print("- Nhập điểm 1: ");
        d1 = sc.nextDouble();
        System.out.print("- Nhập điểm 2: ");
        d2 = sc.nextDouble();
        System.out.print("- Nhập điểm 3: ");
        d3 = sc.nextDouble();
    }

    public void output_NguyenKhanhDuy() {
        System.out.println("- " + ten + ", sinh năm " + namSinh + ", điểm 1: " + d1 + ", điểm 2: " + d2 + ", điểm 3: " + d3 + ".");
    }
}
