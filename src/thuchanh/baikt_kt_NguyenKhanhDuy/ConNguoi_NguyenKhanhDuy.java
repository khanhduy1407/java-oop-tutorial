package baikt_kt_NguyenKhanhDuy;

public abstract class ConNguoi_NguyenKhanhDuy {

    protected String ten, namSinh;

    public ConNguoi_NguyenKhanhDuy() { }

    public ConNguoi_NguyenKhanhDuy(String ten, String namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public abstract void input_NguyenKhanhDuy();

    public abstract void output_NguyenKhanhDuy();
}
