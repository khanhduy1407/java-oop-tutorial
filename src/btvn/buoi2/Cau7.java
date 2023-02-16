package btvn.buoi2;

import java.util.Scanner;

public class Cau7 {

    /**
     * 7. Nhập 1 mảng các số int từ bàn phím. Tìm phần tử lớn nhất trong mảng.
     */
    public Cau7() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Tìm phần tử lớn nhất trong mảng
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nPhần tử lớn nhất trong mảng là: " + max);
    }
}
