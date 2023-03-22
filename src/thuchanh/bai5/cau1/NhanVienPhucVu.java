package thuchanh.bai5.cau1;

class NhanVienPhucVu extends NhanVien {

    public NhanVienPhucVu(String maNV, String tenNV, String trinhDo, double luongCoBan) {
        super(maNV, tenNV, trinhDo, luongCoBan);
    }

    public double tinhLuong() {
        return luongCoBan;
    }

    public void output() {
        System.out.println("- " + maNV + ", " + tenNV + ", trình độ " + trinhDo + ", lương " + luongCoBan + "$.");
    }
}
