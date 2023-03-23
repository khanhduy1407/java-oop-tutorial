package thuchanh.bai5.cau3;

public abstract class Nguoi {

    String ten;
    String namSinh;

    public Nguoi() { }

    public Nguoi(String ten, String namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public abstract void input();

    public abstract void xuat();
}
