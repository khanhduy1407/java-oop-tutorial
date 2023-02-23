package goods;

import java.util.Scanner;

public class SanPham {

    String maSP;
    String tenSP;
    long giaBan;

    public SanPham() {}

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập mã sản phẩm: ");
        maSP = sc.nextLine();
        System.out.print("- Nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.print("- Nhập giá bán: ");
        giaBan = sc.nextInt();
    }

    public void output() {
        System.out.println(maSP + ", " + tenSP + ", " + giaBan + "đ.");
    }
}
