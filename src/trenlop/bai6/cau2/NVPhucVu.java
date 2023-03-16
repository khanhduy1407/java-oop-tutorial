package trenlop.bai6.cau2;

public class NVPhucVu extends NhanVien {

    public NVPhucVu(String ma, String ten, String namSinh, String trinhDo, double luongCB) {
        super(ma, ten, namSinh, trinhDo, luongCB);
    }

    @Override
    void output() {
        System.out.println("- " + ma + ", " + ten + ", sinh năm " + namSinh + ", trình độ " + trinhDo +
                           ", lương " + luongCB + "$.");
    }
}
