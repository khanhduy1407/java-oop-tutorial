package btvn.buoi2;

import java.util.Scanner;

public class Cau9 {

    /**
     * 9. Nhập một ma trận bất kì từ bàn phím. Tính tổng hàng thứ k của ma trận.
     */
    public Cau9() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số dòng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Nhập số dòng k cần tính tổng: ");
        int k = sc.nextInt();

        int tong = 0;
        for (int j = 0; j < cols; j++) {
            tong += arr[k][j];
        }

        System.out.println("Tổng hàng thứ " + k + ": " + tong);
    }
}
