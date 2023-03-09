package trenlop.bai5.cau3;

public class NVQuanLy extends NhanVienCLC {

    double phuCapCV;

    public NVQuanLy(String ten, String namSinh, double luong, String ngayNhanViec,
                    PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao, double phuCapCV) {
        super(ten, namSinh, luong, ngayNhanViec, pbk, trinhDo, nganh, noiDaoTao);
        this.phuCapCV = phuCapCV;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("phụ cấp " + phuCapCV + "$.\n");
    }
}
