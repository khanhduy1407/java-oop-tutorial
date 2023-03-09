package bai5.cau3;

public class HocVien extends Nguoi {

    double diem1;
    double diem2;
    double diem3;

    public HocVien(String ten, String namSinh, double diem1, double diem2, double diem3) {
        super(ten, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("điểm 1: " + diem1 + ", điểm 2: " + diem2 + ", điểm 3: " + diem3 + ".\n");
    }
}
