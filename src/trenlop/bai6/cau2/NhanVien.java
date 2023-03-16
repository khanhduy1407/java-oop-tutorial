package trenlop.bai6.cau2;

public abstract class NhanVien {

    String ma;
    String ten;
    String namSinh;
    String trinhDo;
    double luongCB;

    public NhanVien(String ma, String ten, String namSinh, String trinhDo, double luongCB) {
        this.ma = ma;
        this.ten = ten;
        this.namSinh = namSinh;
        this.trinhDo = trinhDo;
        this.luongCB = luongCB;
    }

    abstract void output();
}
