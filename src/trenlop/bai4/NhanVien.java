package trenlop.bai4;

import java.util.Scanner;

public class NhanVien {
    String maSo;
    String hoTen;
    double luongCoBan;
    double heSoLuong;
    static int soLuongNV;

    public NhanVien() {
        this.maSo = "";
        this.hoTen = "";
        this.luongCoBan = 0.0;
        this.heSoLuong = 0.0;
        soLuongNV++;
    }

    public NhanVien(String maSo, String hoTen, double luongCoBan, double heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNV++;
    }

    public NhanVien(NhanVien nv) {
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCoBan = nv.luongCoBan;
        this.heSoLuong = nv.heSoLuong;
        soLuongNV++;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void nhapNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Nhập mã số: ");
        this.maSo = sc.nextLine();
        System.out.print("- Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("- Nhập lương cơ bản: ");
        this.luongCoBan = sc.nextDouble();
        System.out.print("- Nhập hệ số lương: ");
        this.heSoLuong = sc.nextDouble();
    }

    public void xuatNV() {
        System.out.println("- " + this.maSo + ", " + this.hoTen + ", " + this.luongCoBan + ", " + this.heSoLuong);
    }

    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    public static int getSoLuongNV() {
        return soLuongNV;
    }

    public static void inSoLuongNV() {
        System.out.println("Số lượng nhân viên: " + soLuongNV);
    }
}

