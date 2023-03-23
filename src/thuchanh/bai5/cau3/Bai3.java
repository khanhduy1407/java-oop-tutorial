package thuchanh.bai5.cau3;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int slhv, slnv, slgv;

        System.out.print("- Nhập số lượng học viên: ");
        slhv = sc.nextInt();
        HocVien[] hv = new HocVien[slhv];
        System.out.print("- Nhập số lượng nhân viên: ");
        slnv = sc.nextInt();
        NhanVien[] nv = new NhanVien[slnv];
        System.out.print("- Nhập số lượng giáo viên: ");
        slgv = sc.nextInt();
        GiaoVien[] gv = new GiaoVien[slgv];

        int choose;
        do {
            System.out.print("=====================\n" +
                    "1. Nhập danh sách học viên.\n" +
                    "2. Nhập danh sách nhân viên quản lý.\n" +
                    "3. Nhập danh sách giáo viên.\n" +
                    "4. Xuất thông tin danh sách học viên.\n" +
                    "5. Xuất thông tin danh sách nhân viên quản lý.\n" +
                    "6. Xuất thông tin danh sách giáo viên.\n" +
                    "7. Thoát.\n" +
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
                        nv[i] = new NVQuanLy();
                        System.out.println("Nhập nhân viên quản lý thứ " + (i+1) + ":");
                        nv[i].input();
                    }
                    break;
                case 3:
                    for (int i = 0; i < slhv; i++) {
                        gv[i] = new GiaoVien();
                        System.out.println("Nhập giáo viên thứ " + (i+1) + ":");
                        gv[i].input();
                    }
                    break;
                case 4:
                    for (int i = 0; i < slhv; i++) {
                        hv[i].xuat();
                    }
                    break;
                case 5:
                    for (int i = 0; i < slhv; i++) {
                        nv[i].xuat();
                    }
                    break;
                case 6:
                    for (int i = 0; i < slhv; i++) {
                        gv[i].xuat();
                    }
                    break;
                case 7: System.exit(1); break;
            }
        } while (choose >= 1 && choose <= 7);
    }
}
