package btvn.buoi2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cau;

        System.out.print("Bài tập về nhà buổi 2:\n" +
                "7. Nhập 1 mảng các số int từ bàn phím. Tìm phần tử lớn nhất trong mảng.\n" +
                "9. Nhập một ma trận bất kì từ bàn phím. Tính tổng hàng thứ k của ma trận.\n" +
                "10. Nhập các thông tin của 1 sinh viên gồm mã số, họ tên, diểm trung bình. Xuất ra màn hình.\n" +
                "11. Nhập vào 1 ký tự. Xuất ra màn hình mã số của ký tự vừa nhập.\n" +
                "0. Thoát.\n\n" +
                "Chọn câu: ");

        Scanner sc = new Scanner(System.in);
        cau = sc.nextInt();

        switch (cau) {
            case 7: new Cau7(); break;
            case 9: new Cau9(); break;
            case 10: new Cau10(); break;
            case 11: new Cau11(); break;
            case 0: System.exit(0); break;
            default: System.out.println("Không tồn tại câu " + cau + "!"); break;
        }
    }
}
