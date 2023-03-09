package thuchanh.bai2.cau5;

public class TamGiac {

    int canh1, canh2, canh3;

    // Constructor
    public TamGiac(int canh1, int canh2, int canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    // Phương thức tính chu vi tam giác
    public int chuVi() {
        return canh1 + canh2 + canh3;
    }

    // Phương thức tính diện tích tam giác bằng công thức Heron
    public double dienTich() {
        double p = chuVi() / 2.0;
        return Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }

    // Phương thức xác định loại tam giác
    public String loaiTamGiac() {
        if (canh1 == canh2 && canh2 == canh3) {
            return "Tam giác đều";
        } else if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3) {
            return "Tam giác cân";
        } else {
            return "Tam giác thường";
        }
    }
}
