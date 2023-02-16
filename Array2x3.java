import java.util.Random;

public class Array2x3 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int rand = new Random().nextInt(20) + 1; // 0 - 20
                System.out.print("\t" + rand);
            }
            System.out.print("\n");
        }
    }
}
