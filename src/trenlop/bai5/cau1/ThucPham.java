package trenlop.bai5.cau1;

public class ThucPham extends Goods {

    String ngaySX, hsd;

    public ThucPham(String ma, String ten, String nsx, long gia, String ngaySX, String hsd) {
        super(ma, ten, nsx, gia);
        this.ngaySX = ngaySX;
        this.hsd = hsd;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("NSX: " + ngaySX + ", HSD: " + hsd + ".\n");
    }
}
