package trenlop.bai6.cau2;

public class NVNghienCuu extends NhanVien {

    String truongDT;
    String chuyenMon;
    long phuCapDH;

    public NVNghienCuu(String ma, String ten, String namSinh, String trinhDo, double luongCB, String truongDT, String chuyenMon, long phuCapDH) {
        super(ma, ten, namSinh, trinhDo, luongCB);
        this.truongDT = truongDT;
        this.chuyenMon = chuyenMon;
        this.phuCapDH = phuCapDH;
    }

    @Override
    void output() {
        System.out.println("- " + ma + ", " + ten + ", sinh năm " + namSinh + ", đào tạo tại " + truongDT + ", trình độ " + trinhDo +
                           ", chuyên môn " + chuyenMon + ", lương " + (luongCB + phuCapDH) + "$.");
    }
}
