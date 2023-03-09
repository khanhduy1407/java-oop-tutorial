package bai5.cau3;

public class GiaoVien extends NhanVienCLC {

    double thuLaoGD;

    public GiaoVien(String ten, String namSinh, double luong, String ngayNhanViec,
                    PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao, double thuLaoGD) {
        super(ten, namSinh, luong, ngayNhanViec, pbk, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("thù lao " + thuLaoGD + "$.\n");
    }
}
