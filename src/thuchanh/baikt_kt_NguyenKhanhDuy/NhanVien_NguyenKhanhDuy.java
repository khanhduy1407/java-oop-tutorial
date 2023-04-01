package baikt_kt_NguyenKhanhDuy;

public abstract class NhanVien_NguyenKhanhDuy extends ConNguoi_NguyenKhanhDuy {

    protected double luong;
    protected String ngayNhanViec;
    protected PhongBanKhoa_NguyenKhanhDuy pbk;

    public NhanVien_NguyenKhanhDuy() { }

    public NhanVien_NguyenKhanhDuy(String ten, String namSinh, double luong, String ngayNhanViec, PhongBanKhoa_NguyenKhanhDuy pbk) {
        super(ten, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.pbk = pbk;
    }

    public abstract void input_NguyenKhanhDuy();

    public abstract void output_NguyenKhanhDuy();

    public abstract void luong_NguyenKhanhDuy();
}
