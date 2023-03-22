package thuchanh.bai3.cau1_2;

import java.util.Scanner;

public class HangThucPham extends HangHoa {

    protected String hsd, nsx;

    public HangThucPham() {
        super();
        hsd = nsx = "";
    }

    public HangThucPham(String maHang, String tenHang, long gia, String hsd, String nsx) {
        super(maHang, tenHang, gia);
        this.hsd = hsd;
        this.nsx = nsx;
    }

    public void input() {
        System.out.println("Hàng thực phẩm:");
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập hạn sử dụng: ");
        hsd = sc.nextLine();
        System.out.print("- Nhập ngày sản xuất: ");
        nsx = sc.nextLine();
    }

    public void output() {
        System.out.println("- " + maHang + ", " + tenHang + ", " + gia + "$, còn " + soLuong + ", tổng giá " + tongGia + "$, hsd " + hsd + ", nsx " + nsx + ".");
    }
}
