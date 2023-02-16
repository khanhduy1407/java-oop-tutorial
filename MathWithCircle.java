import java.util.Scanner;

public class MathWithCircle {
    public static void main(String[] args) {
        float r;

        System.out.print("Nhap R: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();

        double cv, dt;
        cv = r * 2 * Math.PI;
        dt = Math.pow(r, 2) * Math.PI;

        System.out.println("Chu vi hinh tron: " + cv);
        System.out.println("Dien tich hinh tron:" + dt);
    }
}
