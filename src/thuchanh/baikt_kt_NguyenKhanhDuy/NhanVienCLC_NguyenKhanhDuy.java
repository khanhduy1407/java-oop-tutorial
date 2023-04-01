package baikt_kt_NguyenKhanhDuy;

public abstract class NhanVienCLC_NguyenKhanhDuy extends NhanVien_NguyenKhanhDuy {

    String trinhDo;
    String nganh;
    String noiDaoTao;

    public NhanVienCLC_NguyenKhanhDuy() { }

    public NhanVienCLC_NguyenKhanhDuy(String ten, String namSinh, double luong, String ngayNhanViec,
                       PhongBanKhoa_NguyenKhanhDuy pbk, String trinhDo, String nganh, String noiDaoTao) {
        super(ten, namSinh, luong, ngayNhanViec, pbk);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    public abstract void input_NguyenKhanhDuy();

    public abstract void output_NguyenKhanhDuy();
}
