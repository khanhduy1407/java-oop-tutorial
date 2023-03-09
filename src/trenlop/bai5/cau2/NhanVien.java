package trenlop.bai5.cau2;

public class NhanVien {

    public String ma;
    public String ten;
    public String namSinh;
    public String trinhDo;
    public static double luongCB;
    public String truongDaoTao;
    public String chuyenMon;

    public NhanVien(String ma, String ten, String namSinh, String trinhDo) {
        this.ma = ma;
        this.ten = ten;
        this.namSinh = namSinh;
        this.trinhDo = trinhDo;
    }

    public void xuat() {
        System.out.print("- " + ma + ", " + ten + ", " + namSinh + ", trình độ " + trinhDo + ", ");
    }
}
