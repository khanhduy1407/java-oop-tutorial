package thuchanh.bai3.cau1_2;

import java.util.Scanner;

public class HangDienMay extends HangHoa {

    protected int thoiGianBH, congSuat, dienAp;

    public HangDienMay() {
        super();
        thoiGianBH = congSuat = dienAp = 0;
    }

    public HangDienMay(String maHang, String tenHang, long gia, int thoiGianBH, int congSuat, int dienAp) {
        super(maHang, tenHang, gia);
        this.thoiGianBH = thoiGianBH;
        this.congSuat = congSuat;
        this.dienAp = dienAp;
    }

    public void input() {
        System.out.println("Hàng điện máy:");
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập thời gian bảo hành (tháng): ");
        thoiGianBH = sc.nextInt();
        System.out.print("- Nhập công suất (kW): ");
        congSuat = sc.nextInt();
        System.out.print("- Nhập điện áp (mA): ");
        dienAp = sc.nextInt();
    }

    public void output() {
        System.out.println("- " + maHang + ", " + tenHang + ", " + gia + "$, còn " + soLuong + ", tổng giá " + tongGia + "$, bảo hành "
                           + thoiGianBH + " tháng, " + congSuat + "kW, " + dienAp + "mA.");
    }
}
