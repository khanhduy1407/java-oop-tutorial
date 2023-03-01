package bai4;

public class Rectangle {
    int dai;
    int rong;

    // Hình vuông
    public Rectangle(int dai) {
        this.dai = dai;
        this.rong = dai;
    }

    // Hình chữ nhật
    public Rectangle(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }

    // Chu vi
    public int chuVi() {
        return 2 * (dai + rong);
    }

    // Diện tích
    public int dienTich() {
        return dai * rong;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(7);

        System.out.println("Hình 1:");
        System.out.println("Chu vi: " + r1.chuVi());
        System.out.println("Diện tích: " + r1.dienTich());

        System.out.println("\nHình 2:");
        System.out.println("Chu vi: " + r2.chuVi());
        System.out.println("Diện tích: " + r2.dienTich());
    }
}

