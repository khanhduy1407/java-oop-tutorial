package bai4;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        // Tạo 3 đối tượng nhân viên bằng 3 cách khác nhau
        NhanVien nv1 = new NhanVien();
        nv1.xuatNV();
        NhanVien nv2 = new NhanVien("NV002", "Nguyễn Văn B", 8000000, 2.0);
        nv2.xuatNV();
        NhanVien nv3 = new NhanVien(nv2);
        nv3.xuatNV();

        // Nhập dữ liệu cho một nhân viên từ bàn phím, xuất ra màn hình
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhân viên thứ 4:\n");
        NhanVien nv4 = new NhanVien();
        nv4.nhapNV();
        System.out.println("\nThông tin nhân viên 4 vừa nhập:");
        nv4.xuatNV();

        // Thay đổi họ tên cho nhân viên và xuất ra màn hình
        System.out.print("\nNhập tên mới cho NV4: ");
//        scanner.nextLine();
        String tenMoi = scanner.nextLine();
        nv4.setHoTen(tenMoi);
        System.out.println("Thông tin NV4 sau khi thay đổi:");
        nv4.xuatNV();

        // In ra thông tin nhân viên có hệ số lương cao nhất trong 3 nhân viên
        NhanVien nvMax = nv1;
        if (nv2.getHeSoLuong() > nvMax.getHeSoLuong()) {
            nvMax = nv2;
        }
        if (nv3.getHeSoLuong() > nvMax.getHeSoLuong()) {
            nvMax = nv3;
        }
        System.out.println("\nThông tin nhân viên có hệ số lương cao nhất:");
        nvMax.xuatNV();

        // Nhập danh sách nhân viên và xuất ra màn hình cùng với lương của mỗi nhân viên
        System.out.print("\nNhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        NhanVien[] dsNhanVien = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
            dsNhanVien[i] = new NhanVien();
            dsNhanVien[i].nhapNV();
        }
        System.out.println("\nDanh sách nhân viên vừa nhập:");
        for (int i = 0; i < n; i++) {
            dsNhanVien[i].xuatNV();
            System.out.println("\tLương: " + dsNhanVien[i].tinhLuong());
        }

        // In số lượng nhân viên trong danh sách
        System.out.println("\nSố lượng nhân viên trong danh sách: " + NhanVien.getSoLuongNV());
    }
}
