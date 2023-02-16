import java.util.Scanner;

public class ArrayInt {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        int tong = 0;

        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int j : arr) {
            tong += j;
        }

        System.out.println("\nTổng các phần tử trong mảng: " + tong);
    }
}
