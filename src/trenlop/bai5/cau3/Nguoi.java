package trenlop.bai5.cau3;

public class Nguoi {

    String ten;
    String namSinh;

    public Nguoi() { }

    public Nguoi(String ten, String namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public void xuat() {
        System.out.print("- " + ten + ", sinh năm " + namSinh + ", ");
    }
}
