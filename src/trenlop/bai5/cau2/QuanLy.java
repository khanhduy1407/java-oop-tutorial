package trenlop.bai5.cau2;

public class QuanLy extends NhanVien {

    double phuCapChucVu;

    public QuanLy(String ma, String ten, String namSinh, String trinhDo,
                  String truongDaoTao, String chuyenMon, double phuCapChucVu) {
        super(ma, ten, namSinh, trinhDo);
        luongCB = 10;
        this.truongDaoTao = truongDaoTao;
        this.chuyenMon = chuyenMon;
        this.phuCapChucVu = phuCapChucVu;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print(luongCB + "$, " + truongDaoTao + ", " + chuyenMon + ", " + phuCapChucVu + "$.\n");
    }
}
