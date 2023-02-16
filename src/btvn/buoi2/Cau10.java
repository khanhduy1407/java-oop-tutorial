package btvn.buoi2;

import java.util.Scanner;

public class Cau10 {

    /**
     * 10. Nhập các thông tin của 1 sinh viên gồm mã số, họ tên, diểm trung bình. Xuất ra màn hình.
     */
    public Cau10() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã số: ");
        String maSV = sc.nextLine();

        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double diemTB = sc.nextDouble();

        System.out.println("Mã số sinh viên: " + maSV);
        System.out.println("Họ tên sinh viên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);
    }
}
