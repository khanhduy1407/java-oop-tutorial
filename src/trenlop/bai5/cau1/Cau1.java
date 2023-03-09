package trenlop.bai5.cau1;

public class Cau1 {

    public static void main(String[] args) {
        DienMay dm1 = new DienMay("DM01", "No name", "Vô danh",
                10000, "1 ngày", 10, 5);
        dm1.xuat();

        SanhSu ss1 = new SanhSu("SS01", "Không tên", "ABC", 20000, "Cát");
        ss1.xuat();

        ThucPham tp1 = new ThucPham("TP01", "Cỏ", "DEF", 1000, "10/2/1999", "11/2/1999");
        tp1.xuat();
    }
}
