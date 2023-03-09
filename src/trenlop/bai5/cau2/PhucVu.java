package trenlop.bai5.cau2;

public class PhucVu extends NhanVien {

    public PhucVu(String ma, String ten, String namSinh, String trinhDo) {
        super(ma, ten, namSinh, trinhDo);
        luongCB = 2;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print(luongCB + ".\n");
    }
}
