package thuchanh.bai2.cau5;

public class Demo {

    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac(3, 4, 5);
        TamGiac tg2 = new TamGiac(6, 8, 10);
        TamGiac tg3 = new TamGiac(3, 3, 3);

        System.out.println("Tam giác 1: chu vi = " + tg1.chuVi() + ", diện tích = " + tg1.dienTich() + ", loại: " + tg1.loaiTamGiac());
        System.out.println("Tam giác 2: chu vi = " + tg2.chuVi() + ", diện tích = " + tg2.dienTich() + ", loại: " + tg2.loaiTamGiac());
        System.out.println("Tam giác 3: chu vi = " + tg3.chuVi() + ", diện tích = " + tg3.dienTich() + ", loại: " + tg3.loaiTamGiac());
    }
}
