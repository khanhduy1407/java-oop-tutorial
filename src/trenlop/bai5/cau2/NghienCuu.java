package trenlop.bai5.cau2;

public class NghienCuu extends NhanVien {

    double phuCapDocHai;

    public NghienCuu(String ma, String ten, String namSinh, String trinhDo,
                     String truongDaoTao, String chuyenMon, double phuCapDocHai) {
        super(ma, ten, namSinh, trinhDo);
        luongCB = 5;
        this.truongDaoTao = truongDaoTao;
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print(luongCB + "$, " + truongDaoTao + ", " + chuyenMon + ", " + phuCapDocHai + "$.\n");
    }
}
