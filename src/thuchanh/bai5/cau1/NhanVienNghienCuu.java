package thuchanh.bai5.cau1;

class NhanVienNghienCuu extends NhanVien {

    protected String chuyenMon;
    protected double phuCapDocHai;

    public NhanVienNghienCuu(String maNV, String tenNV, String trinhDo, double luongCoBan, String chuyenMon, double phuCapDocHai) {
        super(maNV, tenNV, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }

    public double tinhLuong() {
        return luongCoBan + phuCapDocHai;
    }

    public void output() {
        System.out.println("- " + maNV + ", " + tenNV + ", trình độ " + trinhDo + ", chuyên môn " + chuyenMon + "\n" +
                           "  + Lương cơ bản " + luongCoBan + "$, phụ cấp " + phuCapDocHai + "$, tổng lương " + tinhLuong() + "$.");
    }
}
