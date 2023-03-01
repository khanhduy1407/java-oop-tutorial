package bai4;

import java.util.Scanner;

/**
 * Phân số trong toán học
 */
public class PhanSo {

    int tu;
    int mau;

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    /**
     * Phương thức khởi tạo chuẩn.
     * <p>
     * Khởi tạo phân số mặc định: <code>tử = 0</code>, <code>mẫu = 1</code>
     */
    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    /**
     * Phương thức khởi tạo 2 tham số.
     * <p>
     * Khởi tạo phân số với 2 giá trị tử mẫu nhập vào.
     *
     * @param tu Tử số
     * @param mau Mẫu số
     */
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    /**
     * Nhập giá trị phân số từ bàn phím.
     */
    public void nhapPS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tu = sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        mau = sc.nextInt();
    }

    /**
     * In ra phân số.
     */
    public void inPS() {
        System.out.println(tu + "/" + mau);
    }

    /**
     * Tìm ước số chung lớn nhất của tử và mẫu trong 1 phân số.
     *
     * @param tu Tử số
     * @param mau Mẫu số
     */
    public static int timUSCLN(int tu, int mau) {
        if (mau == 0) {
            return tu;
        }
        return timUSCLN(mau, tu % mau);
    }

    /**
     * Rút gọn phân số.
     * <p>
     * Ví dụ: 2/4 -> 1/2
     */
    public void rutGonPS() {
        int uscln = timUSCLN(tu, mau);
        tu /= uscln;
        mau /= uscln;
    }

    /**
     * Cộng 2 phân số lại với nhau và trả về kết quả là 1 phân số mới.
     * <p>
     * Ví dụ:
     * <pre>{@code
     * PhanSo ps1 = new PhanSo(1, 2);
     * PhanSo ps2 = new PhanSo(3, 4);
     *
     * PhanSo tong = ps1.congPS(ps2);
     * System.out.println("Tổng 2 phân số: " + tong);
     * }</pre>
     *
     * @param ps Phân số cộng
     */
    public PhanSo congPS(PhanSo ps) {
        PhanSo tong = new PhanSo();
        tong.tu = this.tu * ps.mau + ps.tu * this.mau;
        tong.mau = this.mau * ps.mau;
        tong.rutGonPS();

        return tong;
    }

    /**
     * Trừ 2 phân số và trả về kết quả là 1 phân số mới.
     * <p>
     * Ví dụ:
     * <pre>{@code
     * PhanSo ps1 = new PhanSo(1, 2);
     * PhanSo ps2 = new PhanSo(1, 3);
     *
     * PhanSo hieu = ps1.truPS(ps2);
     * System.out.println("Hiệu 2 phân số: " + hieu);
     * }</pre>
     *
     * @param ps Phân số trừ
     */
    public PhanSo truPS(PhanSo ps) {
        PhanSo hieu = new PhanSo();
        hieu.tu = this.tu * ps.mau + ps.tu * this.mau;
        hieu.mau = this.mau * ps.mau;
        hieu.rutGonPS();

        return hieu;
    }

    /**
     * Nhân 2 phân số lại với nhau và trả về kết quả là 1 phân số mới.
     * <p>
     * Ví dụ:
     * <pre>{@code
     * PhanSo ps1 = new PhanSo(1, 2);
     * PhanSo ps2 = new PhanSo(3, 4);
     *
     * PhanSo tich = ps1.nhanPS(ps2);
     * System.out.println(tich.toString());
     * }</pre>
     *
     * @param ps Phân số nhân
     */
    public PhanSo nhanPS(PhanSo ps) {
        PhanSo tich = new PhanSo();
        tich.tu = this.tu * ps.tu;
        tich.mau = this.mau * ps.mau;
        tich.rutGonPS();

        return tich;
    }

    /**
     * Chia 2 phân số và trả về kết quả là 1 phân số mới.
     * <p>
     * Ví dụ:
     * <pre>{@code
     * PhanSo ps1 = new PhanSo(2, 3);
     * PhanSo ps2 = new PhanSo(1, 4);
     * PhanSo thuong = ps1.chiaPS(ps2);
     * thuong.inPS();
     * }</pre>
     *
     * @param ps Phân số chia
     */
    public PhanSo chiaPS(PhanSo ps) {
        PhanSo thuong = new PhanSo();
        thuong.tu = this.tu * ps.mau;
        thuong.mau = this.mau * ps.tu;
        thuong.rutGonPS();

        return thuong;
    }
}
