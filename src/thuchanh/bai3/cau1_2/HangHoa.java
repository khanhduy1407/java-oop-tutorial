package thuchanh.bai3.cau1_2;

import java.util.Scanner;

public class HangHoa {

    protected String maHang, tenHang;
    protected long gia, tongGia;
    protected int soLuong;

    public HangHoa() {
        maHang = tenHang = "";
        gia = 0;
    }

    public HangHoa(String maHang, String tenHang, long gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập mã hàng: ");
        maHang = sc.nextLine();
        System.out.print("- Nhập tên hàng: ");
        tenHang = sc.nextLine();
        System.out.print("- Nhập giá: ");
        gia = sc.nextLong();
        System.out.print("- Nhập số lượng: ");
        soLuong = sc.nextInt();

        tongGia = gia * soLuong;
    }

    public void output() { }
}
