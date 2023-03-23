package thuchanh.bai5.cau1_2;

class NhanVienQuanLy extends NhanVien {

    protected String chuyenMon;
    protected double phuCapChucVu;

    public NhanVienQuanLy(String maNV, String tenNV, String trinhDo, double luongCoBan, String chuyenMon, double phuCapChucVu) {
        super(maNV, tenNV, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapChucVu = phuCapChucVu;
    }

    public double tinhLuong() {
        return luongCoBan + phuCapChucVu;
    }

    public void output() {
        System.out.println("- " + maNV + ", " + tenNV + ", trình độ " + trinhDo + ", chuyên môn " + chuyenMon + "\n" +
                           "  + Lương cơ bản " + luongCoBan + "$, phụ cấp " + phuCapChucVu + "$, tổng lương " + tinhLuong() + "$.");
    }
}
