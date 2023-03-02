package bai5;

public class Goods {

    String ma, ten, nsx;
    long gia;

    public Goods(String ma, String ten, String nsx, long gia) {
        this.ma = ma;
        this.ten = ten;
        this.nsx = nsx;
        this.gia = gia;
    }

    public void xuat() {
        System.out.print("- " + ma + ", " + ten + ", " + nsx + ", " + gia + "đ, ");
    }
}
