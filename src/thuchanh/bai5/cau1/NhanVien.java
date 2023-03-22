package thuchanh.bai5.cau1;

abstract class NhanVien {

    protected String maNV;
    protected String tenNV;
    protected String trinhDo;
    protected double luongCoBan;

    public NhanVien(String maNV, String tenNV, String trinhDo, double luongCoBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.trinhDo = trinhDo;
        this.luongCoBan = luongCoBan;
    }

    public abstract double tinhLuong();

    public abstract void output();
}

