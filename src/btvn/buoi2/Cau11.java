package btvn.buoi2;

import java.util.Scanner;

public class Cau11 {

    /**
     * 11. Nhập vào 1 ký tự. Xuất ra màn hình mã số của ký tự vừa nhập.
     */
    public Cau11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một ký tự: ");
        char ch = sc.next().charAt(0);

        System.out.println("Mã số của ký tự '" + ch + "': " + (int) ch);
    }
}
