package thuchanh.bai4.cau1_2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HocVien hv1 = new HocVien();
        NhanVien nv1 = new NhanVien();

        int choose;

        do {
            System.out.print("=====================\n" +
                    "1. Nhập 1 học viên.\n" +
                    "2. Nhập 1 nhân viên.\n" +
                    "3. Xuất thông tin 1 học viên.\n" +
                    "4. Xuất thông tin 1 nhân viên.\n" +
                    "5. Thoát.\n" +
                    "Chọn: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1: hv1.input(); break;
                case 2: nv1.input(); break;
                case 3: hv1.output(); break;
                case 4: nv1.output(); break;
                case 5: System.exit(1); break;
            }
        } while (choose >= 1 && choose <= 5);
    }
}
