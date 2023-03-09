package bai5.cau3;

public class NhanVienCLC extends NhanVien {

    String trinhDo;
    String nganh;
    String noiDaoTao;

    public NhanVienCLC(String ten, String namSinh, double luong, String ngayNhanViec,
                       PhongBanKhoa pbk, String trinhDo, String nganh, String noiDaoTao) {
        super(ten, namSinh, luong, ngayNhanViec, pbk);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("\tTrình độ " + trinhDo + ", ngành " + nganh + ", đào tạo tại " + noiDaoTao + ", ");
    }
}
