package bai5.cau2;

public class Cau2 {

    public static void main(String[] args) {
        QuanLy ql01 = new QuanLy("QL01", "Nguyễn Văn A", "1998", "Thạc Sĩ",
                      "Trường đại học ABC", "Kinh doanh", 15);
        ql01.xuat();

        NghienCuu nc01 = new NghienCuu("NC01", "Nguyễn Kim B", "1989", "Tiến Sĩ",
                            "Trường đại học Harvard", "Sinh học", 50);
        nc01.xuat();

        PhucVu pv01 = new PhucVu("PV01", "Phạm Văn C", "2000", "Không có");
        pv01.xuat();
    }
}
