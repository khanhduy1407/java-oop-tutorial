import java.util.Scanner;

public class MathWithRect {
    public static void main(String[] args) {
        int d;
        int r;

        System.out.print("Nhập chiều dài: ");
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();

        System.out.print("Nhập chiều rộng: ");
        r = sc.nextInt();

        int cv, dt;
        cv = (d + r) * 2;
        dt = d * r;

        System.out.println("\nChu vi: " + cv);
        System.out.println("Diện tích: " + dt);
    }
}
