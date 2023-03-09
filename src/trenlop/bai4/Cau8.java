package trenlop.bai4;

public class Cau8 {

    public static void main(String[] args) {
        Rectangle hv = new Rectangle(4);
        Rectangle hcn = new Rectangle(2, 3);

        System.out.println("Hình 1 (hình vuông):");
        System.out.println("Chu vi: " + hv.chuVi());
        System.out.println("Diện tích: " + hv.dienTich());

        System.out.println("\nHình 2 (hình chữ nhật):");
        System.out.println("Chu vi: " + hcn.chuVi());
        System.out.println("Diện tích: " + hcn.dienTich());
    }
}
