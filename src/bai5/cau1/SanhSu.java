package bai5.cau1;

public class SanhSu extends Goods {

    String nguyenLieu;

    public SanhSu(String ma, String ten, String nsx, long gia, String nguyenLieu) {
        super(ma, ten, nsx, gia);
        this.nguyenLieu = nguyenLieu;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("được làm từ " + nguyenLieu + ".\n");
    }
}
