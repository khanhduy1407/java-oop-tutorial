package thuchanh.bai4.cau1_2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int slhv, slnv;

        System.out.print("- Nhập số lượng học viên: ");
        slhv = sc.nextInt();
        HocVien[] hv = new HocVien[slhv];
        System.out.print("- Nhập số lượng nhân viên: ");
        slnv = sc.nextInt();
        NhanVien[] nv = new NhanVien[slnv];

        int choose;
        do {
            System.out.print("=====================\n" +
                    "1. Nhập danh sách học viên.\n" +
                    "2. Nhập danh sách nhân viên.\n" +
                    "3. Xuất thông tin danh sách học viên.\n" +
                    "4. Xuất thông tin danh sách nhân viên.\n" +
                    "5. Thoát.\n" +
                    "Chọn: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    for (int i = 0; i < slhv; i++) {
                        hv[i] = new HocVien();
                        System.out.println("Nhập học viên thứ " + (i+1) + ":");
                        hv[i].input();
                    }
                    break;
                case 2:
                    for (int i = 0; i < slhv; i++) {
                        nv[i] = new NhanVien();
                        System.out.println("Nhập nhân viên thứ " + (i+1) + ":");
                        nv[i].input();
                    }
                    break;
                case 3:
                    for (int i = 0; i < slhv; i++) {
                        hv[i].output();
                    }
                    break;
                case 4:
                    for (int i = 0; i < slhv; i++) {
                        nv[i].output();
                    }
                    break;
                case 5: System.exit(1); break;
            }
        } while (choose >= 1 && choose <= 5);
    }
}
