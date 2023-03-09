package trenlop.bai5.cau1;

public class DienMay extends Goods {

    String baoHanh;
    float dienAp, congSuat;

    public DienMay(String ma, String ten, String nsx, long gia, String baoHanh, float dienAp, float congSuat) {
        super(ma, ten, nsx, gia);
        this.baoHanh = baoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print(baoHanh + ", " + dienAp + "mA, " + congSuat + "kW/h.\n");
    }
}
